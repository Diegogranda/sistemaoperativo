public class OperatingSystemClass {
    private String osName;
    private int osRamMemmoryRequirement;
    private SoftwareClass[] software;
    private String osVersion;
    private String osArchitecture;
    boolean osonlyCommand;
    private int osSpaceRequieremnt;

    // constructores

    public OperatingSystemClass(String osName, int osRamMemmoryRequirement, SoftwareClass[] software, String osVersion, String osArchitecture, boolean osonlyCommand, int osSpaceRequieremnt) {
        this.osName = osName;
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
        this.software = software;
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

    public SoftwareClass[] getSoftware() {
        return software;
    }

    public void setSoftware(SoftwareClass[] software) {
        this.software = software;
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


