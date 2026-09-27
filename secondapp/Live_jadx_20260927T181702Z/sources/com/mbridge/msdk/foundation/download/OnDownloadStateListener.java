package com.mbridge.msdk.foundation.download;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface OnDownloadStateListener<T> {
    void onCancelDownload(DownloadMessage<T> downloadMessage);

    void onDownloadComplete(DownloadMessage<T> downloadMessage);

    void onDownloadError(DownloadMessage<T> downloadMessage, DownloadError downloadError);

    void onDownloadStart(DownloadMessage<T> downloadMessage);

    void onResponseStart(DownloadMessage<T> downloadMessage);
}
