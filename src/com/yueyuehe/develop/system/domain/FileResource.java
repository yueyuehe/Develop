package com.yueyuehe.develop.system.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "SYS_FILERESOURCE")
public class FileResource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FILE_ID")
	private Long file_id;
	
	//文件名称
	@Column(nullable=false)
	private String fileName;
	
	//资源路径
	@Column(nullable=false)
	private String fileUrl;
	
	//文件类型
	private String fileType;
	
	//文件大小
	private String fileSize;
	
	//文件大小
	private String description;
	//状态
	private String status;
	//权限表
		@ManyToMany(targetEntity = Right.class)
		@JoinTable(name = "SYS_RIGHT_FILERESOURCE", joinColumns = @JoinColumn(name="FILE_ID",referencedColumnName = "FILE_ID"), inverseJoinColumns = @JoinColumn(name="RIGHT_ID",referencedColumnName = "RIGHT_ID"))
		private Set<Right> rights = new HashSet<Right>();
		public Long getFile_id() {
			return file_id;
		}
		public void setFile_id(Long file_id) {
			this.file_id = file_id;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileUrl() {
			return fileUrl;
		}
		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}
		public String getFileType() {
			return fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public String getFileSize() {
			return fileSize;
		}
		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Set<Right> getRights() {
			return rights;
		}
		public void setRights(Set<Right> rights) {
			this.rights = rights;
		}
		@Override
		public String toString() {
			return "FileResource [file_id=" + file_id + ", fileName=" + fileName + ", fileUrl=" + fileUrl
					+ ", fileType=" + fileType + ", fileSize=" + fileSize + ", description=" + description + ", status="
					+ status + ", rights=" + rights + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
			result = prime * result + ((fileSize == null) ? 0 : fileSize.hashCode());
			result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
			result = prime * result + ((fileUrl == null) ? 0 : fileUrl.hashCode());
			result = prime * result + ((file_id == null) ? 0 : file_id.hashCode());
			result = prime * result + ((rights == null) ? 0 : rights.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FileResource other = (FileResource) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (fileName == null) {
				if (other.fileName != null)
					return false;
			} else if (!fileName.equals(other.fileName))
				return false;
			if (fileSize == null) {
				if (other.fileSize != null)
					return false;
			} else if (!fileSize.equals(other.fileSize))
				return false;
			if (fileType == null) {
				if (other.fileType != null)
					return false;
			} else if (!fileType.equals(other.fileType))
				return false;
			if (fileUrl == null) {
				if (other.fileUrl != null)
					return false;
			} else if (!fileUrl.equals(other.fileUrl))
				return false;
			if (file_id == null) {
				if (other.file_id != null)
					return false;
			} else if (!file_id.equals(other.file_id))
				return false;
			if (rights == null) {
				if (other.rights != null)
					return false;
			} else if (!rights.equals(other.rights))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			return true;
		}

}
