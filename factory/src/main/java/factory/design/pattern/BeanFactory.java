package factory.design.pattern;


import com.fasterxml.jackson.databind.ObjectMapper;

import factory.design.pattern.exception.BeanCreationException;
import factory.design.pattern.model.ChildBean;
import factory.design.pattern.model.MasterBean;

/**
 * @author rajesh
 * 
 *@Description BeanFactory class demonstrate factory design pattern which hides the creation logic of
 * MasterBean and ChildBean object.BeanFactory class instantiate MasterBean and ChildBean
 * by loading json file and create singelton instance of bean.BeanFactory class instantiate
 * and maintain lifecycle of bean as well.
 */
public class BeanFactory {

	private static MasterBean masterBean;
	private static ChildBean childBean;

	/**
	 * @param jsonBeanName
	 * @return MasterBean
	 * @Description factory method to create a bean
	 */
	public static MasterBean getBean(String jsonBeanName){
		ObjectMapper mapper = new ObjectMapper();
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();

		try {
			MasterBean bean = mapper.readValue(classLoader.getResourceAsStream(jsonBeanName), MasterBean.class);
			if (masterBean == null) {
				masterBean = new MasterBean();
				masterBean.setId(bean.getId());
				masterBean.setMessage(bean.getMessage());
				if (childBean == null) {
					childBean = new ChildBean();
					childBean.setId(bean.getChildBean().getId());
					childBean.setMessage(bean.getChildBean().getMessage());
				}
				masterBean.setChildBean(childBean);
			}
		} catch (Exception ex) {
			throw new BeanCreationException(ex);
		}

		return masterBean;
	}

}
