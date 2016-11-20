/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

/**
 *
 * @author Andrea
 */
public class Usuario {
    private String name;
    private String screenname;
    private String description;
    public Usuario(){
    super();
    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the screenname
     */
    public String getScreenname() {
        return screenname;
    }

    /**
     * @param screenname the screenname to set
     */
    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
