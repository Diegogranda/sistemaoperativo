import java.util.ArrayList;

public class OperatingSystemClass {
    private String osName;
    private int osRamMemmoryRequirement;
    private ArrayList <SoftwareClass> softwares;
    private String osVersion;
    private String osArchitecture;
    boolean osonlyCommand;
    private int osSpaceRequieremnt;

    // constructores

    public OperatingSystemClass(String osName, int osRamMemmoryRequirement, String osVersion, String osArchitecture, boolean osonlyCommand, int osSpaceRequieremnt) {
        this.osName = osName;
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osonlyCommand = osonlyCommand;
        this.osSpaceRequieremnt = osSpaceRequieremnt;
    }


//getters y setters

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public int getOsRamMemmoryRequirement() {
        return osRamMemmoryRequirement;
    }

    public void setOsRamMemmoryRequirement(int osRamMemmoryRequirement) {
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
    }

    public ArrayList<SoftwareClass> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(ArrayList<SoftwareClass> softwares) {
        this.softwares = softwares;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public boolean isOsonlyCommand() {
        return osonlyCommand;
    }

    public void setOsonlyCommand(boolean osonlyCommand) {
        this.osonlyCommand = osonlyCommand;
    }

    public int getOsSpaceRequieremnt() {
        return osSpaceRequieremnt;
    }

    public void setOsSpaceRequieremnt(int osSpaceRequieremnt) {
        this.osSpaceRequieremnt = osSpaceRequieremnt;
    }
}


