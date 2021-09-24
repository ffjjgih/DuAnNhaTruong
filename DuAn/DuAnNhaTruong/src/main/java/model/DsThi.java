package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DS_THI database table.
 * 
 */
@Entity
@Table(name="DS_THI")
@NamedQuery(name="DsThi.findAll", query="SELECT d FROM DsThi d")
public class DsThi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="BLOCKS")
	private String blocks;

	@Column(name="CA_THI")
	private int caThi;

	@Column(name="LOAI_THI")
	private String loaiThi;

	@Column(name="LOP")
	private String lop;

	@Column(name="MA_MON")
	private String maMon;

	private String mua;

	private String nam;

	@Column(name="NGAY_THI")
	private String ngayThi;

	@Column(name="PHONG_THI")
	private String phongThi;

	@Column(name="TEN_MON")
	private String tenMon;

	public DsThi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlocks() {
		return this.blocks;
	}

	public void setBlocks(String blocks) {
		this.blocks = blocks;
	}

	public int getCaThi() {
		return this.caThi;
	}

	public void setCaThi(int caThi) {
		this.caThi = caThi;
	}

	public String getLoaiThi() {
		return this.loaiThi;
	}

	public void setLoaiThi(String loaiThi) {
		this.loaiThi = loaiThi;
	}

	public String getLop() {
		return this.lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getMaMon() {
		return this.maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public String getMua() {
		return this.mua;
	}

	public void setMua(String mua) {
		this.mua = mua;
	}

	public String getNam() {
		return this.nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getNgayThi() {
		return this.ngayThi;
	}

	public void setNgayThi(String ngayThi) {
		this.ngayThi = ngayThi;
	}

	public String getPhongThi() {
		return this.phongThi;
	}

	public void setPhongThi(String phongThi) {
		this.phongThi = phongThi;
	}

	public String getTenMon() {
		return this.tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

}