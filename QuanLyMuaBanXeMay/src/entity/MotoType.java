<<<<<<< HEAD
package entity;

public class MotoType {
	private String typeId;
	private String typeName;

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public MotoType(String typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public MotoType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoType(String nString) {
		super();
		this.typeId = nString;
	}

	@Override
	public String toString() {
		return "MotoType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}

}
=======
package entity;

public class MotoType {
	private String typeId;
	private String typeName;
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public MotoType(String typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public MotoType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MotoType(String nString) {
		super();
		this.typeId = nString;
	}
	@Override
	public String toString() {
		return "MotoType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
	
}
>>>>>>> b4d46ff16c343849253203b9ce3a79a4737dd69a
