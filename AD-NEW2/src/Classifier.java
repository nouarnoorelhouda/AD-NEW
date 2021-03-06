public class Classifier {
    public Classifier(String id, MatchAttribute[] matchAttributes, long memberVnfIndexRef, String name, String rspIDRef,
			String vnfdConnectionPointRef, String vnfdIDRef) {
		super();
		this.id = id;
		this.matchAttributes = matchAttributes;
		this.memberVnfIndexRef = memberVnfIndexRef;
		this.name = name;
		this.rspIDRef = rspIDRef;
		this.vnfdConnectionPointRef = vnfdConnectionPointRef;
		this.vnfdIDRef = vnfdIDRef;
	}
	private String id;
    private MatchAttribute[] matchAttributes;
    private long memberVnfIndexRef;
    private String name;
    private String rspIDRef;
    private String vnfdConnectionPointRef;
    private String vnfdIDRef;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public MatchAttribute[] getMatchAttributes() { return matchAttributes; }
    public void setMatchAttributes(MatchAttribute[] value) { this.matchAttributes = value; }

    public long getMemberVnfIndexRef() { return memberVnfIndexRef; }
    public void setMemberVnfIndexRef(long value) { this.memberVnfIndexRef = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getRspIDRef() { return rspIDRef; }
    public void setRspIDRef(String value) { this.rspIDRef = value; }

    public String getVnfdConnectionPointRef() { return vnfdConnectionPointRef; }
    public void setVnfdConnectionPointRef(String value) { this.vnfdConnectionPointRef = value; }

    public String getVnfdIDRef() { return vnfdIDRef; }
    public void setVnfdIDRef(String value) { this.vnfdIDRef = value; }
}