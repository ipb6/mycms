package com.pb.apps.cms.bean;

public class BasePrivilege {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.name
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.description
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.route
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String route;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.type
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.icon
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_privilege.parent_id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.id
     *
     * @return the value of base_privilege.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.id
     *
     * @param id the value for base_privilege.id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.name
     *
     * @return the value of base_privilege.name
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.name
     *
     * @param name the value for base_privilege.name
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.description
     *
     * @return the value of base_privilege.description
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.description
     *
     * @param description the value for base_privilege.description
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.route
     *
     * @return the value of base_privilege.route
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getRoute() {
        return route;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.route
     *
     * @param route the value for base_privilege.route
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.type
     *
     * @return the value of base_privilege.type
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.type
     *
     * @param type the value for base_privilege.type
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.icon
     *
     * @return the value of base_privilege.icon
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.icon
     *
     * @param icon the value for base_privilege.icon
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_privilege.parent_id
     *
     * @return the value of base_privilege.parent_id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_privilege.parent_id
     *
     * @param parentId the value for base_privilege.parent_id
     *
     * @mbg.generated Tue Nov 19 09:23:17 GMT+08:00 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}