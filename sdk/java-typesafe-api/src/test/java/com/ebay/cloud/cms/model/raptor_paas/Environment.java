package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;
import java.util.ArrayList;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Environment extends GenericCMSEntity {

	public enum ActionStatusEnum {
		EV_DONE("DONE"),
		EV_Doing("Doing");

		private String value;

        ActionStatusEnum(String val) {
            value = val;
        }

        public String getValue() {
            return value;
        }
        
        public static ActionStatusEnum fromString(String val) {
		    if (val == null || val.length() < 1) {
		        return null;
		    }
		    for (ActionStatusEnum v : ActionStatusEnum.values()) {
		        if (v.toString().equalsIgnoreCase(val)) {
		            return v;
		        }
		    }
		    return null;
        }
        
        public String toString() {
        	return value;
        }
	}

	public Environment() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	
	// long field handling : json will convert long value as integer, need convert
	public Long getTotal(){
		return (Long) getLongField("total");
	}

	public void setTotal(Long attrVal_total){
		setLongField("total", attrVal_total);
	}

	public Integer getNumService(){
		return (Integer)getFieldValue("numService");
	}

	public void setNumService(Integer attrVal_numService){
		setFieldValue("numService", attrVal_numService);
	}
		
	public ClassOfService getCos(){
		return (ClassOfService)getFieldValue("cos");
	}

	public void setCos(ClassOfService attrVal_cos){
		setFieldValue("cos", attrVal_cos);
	}

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}
		
	public List<ApplicationService> getApplications(){
		return (List<ApplicationService>) getFieldValue("applications");
	}

	public void setApplications(List<ApplicationService> attrVals_applications){
		setFieldValue("applications", attrVals_applications);
	}
	
	public void addApplications(ApplicationService attrVal_applications){
		addFieldValue("applications", attrVal_applications);
	}
		
	public ActionStatusEnum getActionStatus(){
		Object val = getFieldValue("actionStatus");
		if (val instanceof ActionStatusEnum) {
			return (ActionStatusEnum)val;
		}
		return ActionStatusEnum.fromString((String)getFieldValue("actionStatus"));
	}

	public void setActionStatus(ActionStatusEnum attrVal_actionStatus){
		setFieldValue("actionStatus", attrVal_actionStatus);
	}
	// long field handling : json will convert long value as integer, need convert
	public Long getNumServices(){
		return (Long) getLongField("numServices");
	}

	public void setNumServices(Long attrVal_numServices){
		setLongField("numServices", attrVal_numServices);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Environment";
	}
	
}