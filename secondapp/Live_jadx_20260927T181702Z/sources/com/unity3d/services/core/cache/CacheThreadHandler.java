package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Code duplicated, block: B:128:0x0328 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.unity3d.services.core.request.WebRequest] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.unity3d.services.core.cache.CacheThreadHandler] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v36 */
    /* JADX WARN: Type inference failed for: r24v37 */
    /* JADX WARN: Type inference failed for: r24v38 */
    /* JADX WARN: Type inference failed for: r24v39 */
    /* JADX WARN: Type inference failed for: r24v40 */
    /* JADX WARN: Type inference failed for: r24v41 */
    /* JADX WARN: Type inference failed for: r24v42 */
    /* JADX WARN: Type inference failed for: r24v43 */
    /* JADX WARN: Type inference failed for: r24v44 */
    /* JADX WARN: Type inference failed for: r24v45 */
    /* JADX WARN: Type inference failed for: r24v46 */
    /* JADX WARN: Type inference failed for: r24v47 */
    /* JADX WARN: Type inference failed for: r24v48 */
    /* JADX WARN: Type inference failed for: r24v49 */
    /* JADX WARN: Type inference failed for: r24v50 */
    /* JADX WARN: Type inference failed for: r24v51 */
    /* JADX WARN: Type inference failed for: r24v52 */
    /* JADX WARN: Type inference failed for: r24v64 */
    /* JADX WARN: Type inference failed for: r24v65 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void downloadFile(String str, String str2, int i10, int i11, final int i12, HashMap<String, List<String>> map, boolean z10, final CacheEventSender cacheEventSender) throws Throwable {
        char c10;
        ?? r10;
        int i13;
        char c11;
        WebRequest webRequest;
        ?? r11;
        int i14;
        char c12;
        WebRequest webRequest2;
        ?? r12;
        int i15;
        char c13;
        WebRequest webRequest3;
        ?? r13;
        int i16;
        char c14;
        WebRequest webRequest4;
        ?? r14;
        int i17;
        char c15;
        WebRequest webRequest5;
        ?? r15;
        int i18;
        char c16;
        WebRequest webRequest6;
        Throwable th2;
        ?? r24;
        ?? r16;
        ?? r17;
        int i19;
        boolean z11;
        char c17;
        FileOutputStream fileOutputStream;
        char c18;
        WebRequest webRequest7;
        boolean z12;
        int i20;
        char c19;
        WebRequest webRequest8;
        boolean z13;
        int i21;
        char c20;
        WebRequest webRequest9;
        boolean z14;
        int i22;
        char c21;
        WebRequest webRequest10;
        boolean z15;
        int i23;
        char c22;
        WebRequest webRequest11;
        boolean z16;
        int i24;
        char c23;
        WebRequest webRequest12;
        boolean z17;
        int i25;
        char c24;
        WebRequest webRequest13;
        if (this._canceled || str == null || str2 == 0) {
            return;
        }
        final ?? file = new File((String) str2);
        if (z10) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + ((String) str2) + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + ((String) str2));
        }
        ?? r18 = 2;
        ?? r19 = 1;
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream((File) file, z10);
                try {
                    WebRequest webRequest14 = getWebRequest(str, i10, i11, map);
                    this._currentRequest = webRequest14;
                    webRequest14.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j10, long j11) {
                            if (i12 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i12) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j10), Long.valueOf(j11));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j10, int i26, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(j10 + file.length()), Integer.valueOf(i26), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream3);
                    this._active = false;
                    char c25 = 2;
                    WebRequest webRequest15 = null;
                    c10 = 1;
                    fileOutputStream = fileOutputStream3;
                    try {
                        postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                        this._currentRequest = null;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            DeviceLog.exception("Error closing stream", e10);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e10.getMessage());
                        }
                    } catch (NetworkIOException e11) {
                        e = e11;
                        i25 = 3;
                        z17 = false;
                        webRequest13 = webRequest15;
                        c24 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i18 = i25;
                        r15 = z17;
                        webRequest6 = webRequest13;
                        c16 = c24;
                        DeviceLog.exception("Network error", e);
                        this._active = r15;
                        CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                        String message = e.getMessage();
                        Object[] objArr = new Object[i18];
                        objArr[r15] = CacheError.NETWORK_ERROR;
                        objArr[c10] = str;
                        objArr[c16] = message;
                        cacheEventSender.sendEvent(cacheEvent, objArr);
                        this._currentRequest = webRequest6;
                        r19 = i18;
                        file = r15;
                        r18 = webRequest6;
                        str2 = c16;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i18;
                                file = r15;
                                r18 = webRequest6;
                                str2 = c16;
                            } catch (Exception e12) {
                                DeviceLog.exception("Error closing stream", e12);
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                String message2 = e12.getMessage();
                                Object[] objArr2 = new Object[i18];
                                objArr2[r15] = CacheError.FILE_IO_ERROR;
                                objArr2[c10] = str;
                                objArr2[c16] = message2;
                                cacheEventSender.sendEvent(cacheEvent2, objArr2);
                                r19 = objArr2;
                                file = r15;
                                r18 = webRequest6;
                                str2 = c16;
                            }
                        }
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        i24 = 3;
                        z16 = false;
                        webRequest12 = webRequest15;
                        c23 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i17 = i24;
                        r14 = z16;
                        webRequest5 = webRequest12;
                        c15 = c23;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = r14;
                        CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                        String message3 = e.getMessage();
                        Object[] objArr3 = new Object[i17];
                        objArr3[r14] = CacheError.FILE_IO_ERROR;
                        objArr3[c10] = str;
                        objArr3[c15] = message3;
                        cacheEventSender.sendEvent(cacheEvent3, objArr3);
                        this._currentRequest = webRequest5;
                        r19 = i17;
                        file = r14;
                        r18 = webRequest5;
                        str2 = c15;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i17;
                                file = r14;
                                r18 = webRequest5;
                                str2 = c15;
                            } catch (Exception e14) {
                                DeviceLog.exception("Error closing stream", e14);
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                String message4 = e14.getMessage();
                                Object[] objArr4 = new Object[i17];
                                objArr4[r14] = CacheError.FILE_IO_ERROR;
                                objArr4[c10] = str;
                                objArr4[c15] = message4;
                                cacheEventSender.sendEvent(cacheEvent4, objArr4);
                                r19 = objArr4;
                                file = r14;
                                r18 = webRequest5;
                                str2 = c15;
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i23 = 3;
                        z15 = false;
                        webRequest11 = webRequest15;
                        c22 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i14 = i23;
                        r11 = z15;
                        webRequest2 = webRequest11;
                        c12 = c22;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = r11;
                        CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                        String message5 = e.getMessage();
                        Object[] objArr5 = new Object[i14];
                        objArr5[r11] = CacheError.FILE_IO_ERROR;
                        objArr5[c10] = str;
                        objArr5[c12] = message5;
                        cacheEventSender.sendEvent(cacheEvent5, objArr5);
                        this._currentRequest = webRequest2;
                        r19 = i14;
                        file = r11;
                        r18 = webRequest2;
                        str2 = c12;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i14;
                                file = r11;
                                r18 = webRequest2;
                                str2 = c12;
                            } catch (Exception e16) {
                                DeviceLog.exception("Error closing stream", e16);
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                String message6 = e16.getMessage();
                                Object[] objArr6 = new Object[i14];
                                objArr6[r11] = CacheError.FILE_IO_ERROR;
                                objArr6[c10] = str;
                                objArr6[c12] = message6;
                                cacheEventSender.sendEvent(cacheEvent6, objArr6);
                                r19 = objArr6;
                                file = r11;
                                r18 = webRequest2;
                                str2 = c12;
                            }
                        }
                    } catch (IllegalStateException e17) {
                        e = e17;
                        i22 = 3;
                        z14 = false;
                        webRequest10 = webRequest15;
                        c21 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i16 = i22;
                        r13 = z14;
                        webRequest4 = webRequest10;
                        c14 = c21;
                        DeviceLog.exception("Illegal state", e);
                        this._active = r13;
                        CacheEvent cacheEvent7 = CacheEvent.DOWNLOAD_ERROR;
                        String message7 = e.getMessage();
                        Object[] objArr7 = new Object[i16];
                        objArr7[r13] = CacheError.ILLEGAL_STATE;
                        objArr7[c10] = str;
                        objArr7[c14] = message7;
                        cacheEventSender.sendEvent(cacheEvent7, objArr7);
                        this._currentRequest = webRequest4;
                        r19 = i16;
                        file = r13;
                        r18 = webRequest4;
                        str2 = c14;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i16;
                                file = r13;
                                r18 = webRequest4;
                                str2 = c14;
                            } catch (Exception e18) {
                                DeviceLog.exception("Error closing stream", e18);
                                CacheEvent cacheEvent8 = CacheEvent.DOWNLOAD_ERROR;
                                String message8 = e18.getMessage();
                                Object[] objArr8 = new Object[i16];
                                objArr8[r13] = CacheError.FILE_IO_ERROR;
                                objArr8[c10] = str;
                                objArr8[c14] = message8;
                                cacheEventSender.sendEvent(cacheEvent8, objArr8);
                                r19 = objArr8;
                                file = r13;
                                r18 = webRequest4;
                                str2 = c14;
                            }
                        }
                    } catch (MalformedURLException e19) {
                        e = e19;
                        i21 = 3;
                        z13 = false;
                        webRequest9 = webRequest15;
                        c20 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i15 = i21;
                        r12 = z13;
                        webRequest3 = webRequest9;
                        c13 = c20;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = r12;
                        CacheEvent cacheEvent9 = CacheEvent.DOWNLOAD_ERROR;
                        String message9 = e.getMessage();
                        Object[] objArr9 = new Object[i15];
                        objArr9[r12] = CacheError.MALFORMED_URL;
                        objArr9[c10] = str;
                        objArr9[c13] = message9;
                        cacheEventSender.sendEvent(cacheEvent9, objArr9);
                        this._currentRequest = webRequest3;
                        r19 = i15;
                        file = r12;
                        r18 = webRequest3;
                        str2 = c13;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i15;
                                file = r12;
                                r18 = webRequest3;
                                str2 = c13;
                            } catch (Exception e20) {
                                DeviceLog.exception("Error closing stream", e20);
                                CacheEvent cacheEvent10 = CacheEvent.DOWNLOAD_ERROR;
                                String message10 = e20.getMessage();
                                Object[] objArr10 = new Object[i15];
                                objArr10[r12] = CacheError.FILE_IO_ERROR;
                                objArr10[c10] = str;
                                objArr10[c13] = message10;
                                cacheEventSender.sendEvent(cacheEvent10, objArr10);
                                r19 = objArr10;
                                file = r12;
                                r18 = webRequest3;
                                str2 = c13;
                            }
                        }
                    } catch (Exception e21) {
                        e = e21;
                        i20 = 3;
                        z12 = false;
                        webRequest8 = webRequest15;
                        c19 = c25;
                        fileOutputStream2 = fileOutputStream;
                        i13 = i20;
                        r10 = z12;
                        webRequest = webRequest8;
                        c11 = c19;
                        DeviceLog.exception("Unknown error", e);
                        this._active = r10;
                        CacheEvent cacheEvent11 = CacheEvent.DOWNLOAD_ERROR;
                        String message11 = e.getMessage();
                        Object[] objArr11 = new Object[i13];
                        objArr11[r10] = CacheError.UNKNOWN_ERROR;
                        objArr11[c10] = str;
                        objArr11[c11] = message11;
                        cacheEventSender.sendEvent(cacheEvent11, objArr11);
                        this._currentRequest = webRequest;
                        r19 = i13;
                        file = r10;
                        r18 = webRequest;
                        str2 = c11;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r19 = i13;
                                file = r10;
                                r18 = webRequest;
                                str2 = c11;
                            } catch (Exception e22) {
                                DeviceLog.exception("Error closing stream", e22);
                                CacheEvent cacheEvent12 = CacheEvent.DOWNLOAD_ERROR;
                                String message12 = e22.getMessage();
                                Object[] objArr12 = new Object[i13];
                                objArr12[r10] = CacheError.FILE_IO_ERROR;
                                objArr12[c10] = str;
                                objArr12[c11] = message12;
                                cacheEventSender.sendEvent(cacheEvent12, objArr12);
                                r19 = objArr12;
                                file = r10;
                                r18 = webRequest;
                                str2 = c11;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c17 = 3;
                        z11 = false;
                        webRequest7 = webRequest15;
                        c18 = c25;
                        th2 = th;
                        fileOutputStream2 = fileOutputStream;
                        i19 = c17;
                        r17 = z11;
                        r16 = webRequest7;
                        r24 = c18;
                        this._currentRequest = r16;
                        if (fileOutputStream2 == null) {
                            throw th2;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th2;
                        } catch (Exception e23) {
                            DeviceLog.exception("Error closing stream", e23);
                            CacheEvent cacheEvent13 = CacheEvent.DOWNLOAD_ERROR;
                            String message13 = e23.getMessage();
                            Object[] objArr13 = new Object[i19];
                            objArr13[r17] = CacheError.FILE_IO_ERROR;
                            objArr13[c10] = str;
                            objArr13[r24] = message13;
                            cacheEventSender.sendEvent(cacheEvent13, objArr13);
                            throw th2;
                        }
                    }
                } catch (NetworkIOException e24) {
                    e = e24;
                    c10 = 1;
                    z17 = false;
                    i25 = 3;
                    fileOutputStream = fileOutputStream3;
                    c24 = 2;
                    webRequest13 = null;
                } catch (FileNotFoundException e25) {
                    e = e25;
                    c10 = 1;
                    z16 = false;
                    i24 = 3;
                    fileOutputStream = fileOutputStream3;
                    c23 = 2;
                    webRequest12 = null;
                } catch (IOException e26) {
                    e = e26;
                    c10 = 1;
                    z15 = false;
                    i23 = 3;
                    fileOutputStream = fileOutputStream3;
                    c22 = 2;
                    webRequest11 = null;
                } catch (IllegalStateException e27) {
                    e = e27;
                    c10 = 1;
                    z14 = false;
                    i22 = 3;
                    fileOutputStream = fileOutputStream3;
                    c21 = 2;
                    webRequest10 = null;
                } catch (MalformedURLException e28) {
                    e = e28;
                    c10 = 1;
                    z13 = false;
                    i21 = 3;
                    fileOutputStream = fileOutputStream3;
                    c20 = 2;
                    webRequest9 = null;
                } catch (Exception e29) {
                    e = e29;
                    c10 = 1;
                    z12 = false;
                    i20 = 3;
                    fileOutputStream = fileOutputStream3;
                    c19 = 2;
                    webRequest8 = null;
                } catch (Throwable th4) {
                    th = th4;
                    c10 = 1;
                    z11 = false;
                    c17 = 3;
                    fileOutputStream = fileOutputStream3;
                    c18 = 2;
                    webRequest7 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                i19 = r19;
                r17 = file;
                r16 = r18;
                r24 = str2;
                this._currentRequest = r16;
                if (fileOutputStream2 == null) {
                    throw th2;
                }
                fileOutputStream2.close();
                throw th2;
            }
        } catch (NetworkIOException e30) {
            e = e30;
            c10 = 1;
            r15 = 0;
            i18 = 3;
            c16 = 2;
            webRequest6 = null;
        } catch (FileNotFoundException e31) {
            e = e31;
            c10 = 1;
            r14 = 0;
            i17 = 3;
            c15 = 2;
            webRequest5 = null;
        } catch (IllegalStateException e32) {
            e = e32;
            c10 = 1;
            r13 = 0;
            i16 = 3;
            c14 = 2;
            webRequest4 = null;
        } catch (MalformedURLException e33) {
            e = e33;
            c10 = 1;
            r12 = 0;
            i15 = 3;
            c13 = 2;
            webRequest3 = null;
        } catch (IOException e34) {
            e = e34;
            c10 = 1;
            r11 = 0;
            i14 = 3;
            c12 = 2;
            webRequest2 = null;
        } catch (Exception e35) {
            e = e35;
            c10 = 1;
            r10 = 0;
            i13 = 3;
            c11 = 2;
            webRequest = null;
        } catch (Throwable th6) {
            th = th6;
            c10 = 1;
            file = 0;
            r19 = 3;
            str2 = 2;
            r18 = 0;
            th2 = th;
            i19 = r19;
            r17 = file;
            r16 = r18;
            r24 = str2;
            this._currentRequest = r16;
            if (fileOutputStream2 == null) {
                throw th2;
            }
            fileOutputStream2.close();
            throw th2;
        }
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i10, i11);
    }

    private void postProcessDownload(long j10, String str, File file, long j11, long j12, boolean z10, int i10, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z10) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j11 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z10 = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z10 && !file.exists()) || (!z10 && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z10), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i10, i11, i12, map2, z10, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z10) {
        WebRequest webRequest;
        this._canceled = z10;
        if (!z10 || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
