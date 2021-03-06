/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.windowsazure.services.blob.models;

import java.util.HashMap;

public class CreateBlobOptions extends BlobServiceOptions {
    private String contentType;
    private String contentEncoding;
    private String contentLanguage;
    private String contentMD5;
    private String cacheControl;
    private String blobContentType;
    private String blobContentEncoding;
    private String blobContentLanguage;
    private String blobContentMD5;
    private String blobCacheControl;
    private HashMap<String, String> metadata = new HashMap<String, String>();
    private String leaseId;
    private Long sequenceNumber;
    private AccessCondition accessCondition;

    @Override
    public CreateBlobOptions setTimeout(Integer timeout) {
        super.setTimeout(timeout);
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public CreateBlobOptions setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public CreateBlobOptions setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public CreateBlobOptions setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    public String getContentMD5() {
        return contentMD5;
    }

    public CreateBlobOptions setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public CreateBlobOptions setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    public String getBlobContentType() {
        return blobContentType;
    }

    public CreateBlobOptions setBlobContentType(String blobContentType) {
        this.blobContentType = blobContentType;
        return this;
    }

    public String getBlobContentEncoding() {
        return blobContentEncoding;
    }

    public CreateBlobOptions setBlobContentEncoding(String blobContentEncoding) {
        this.blobContentEncoding = blobContentEncoding;
        return this;
    }

    public String getBlobContentLanguage() {
        return blobContentLanguage;
    }

    public CreateBlobOptions setBlobContentLanguage(String blobContentLanguage) {
        this.blobContentLanguage = blobContentLanguage;
        return this;
    }

    public String getBlobContentMD5() {
        return blobContentMD5;
    }

    public CreateBlobOptions setBlobContentMD5(String blobContentMD5) {
        this.blobContentMD5 = blobContentMD5;
        return this;
    }

    public String getBlobCacheControl() {
        return blobCacheControl;
    }

    public CreateBlobOptions setBlobCacheControl(String blobCacheControl) {
        this.blobCacheControl = blobCacheControl;
        return this;
    }

    public HashMap<String, String> getMetadata() {
        return metadata;
    }

    public CreateBlobOptions setMetadata(HashMap<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateBlobOptions addMetadata(String key, String value) {
        this.getMetadata().put(key, value);
        return this;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public CreateBlobOptions setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    public CreateBlobOptions setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public AccessCondition getAccessCondition() {
        return accessCondition;
    }

    public CreateBlobOptions setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
        return this;
    }
}
