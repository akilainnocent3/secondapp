package com.startapp.sdk.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface oc {
    void close();

    void createCalendarEvent(String str);

    void expand(String str);

    boolean open(String str);

    void playVideo(String str);

    void resize();

    void setExpandProperties(Map<String, String> map);

    void setOrientationProperties(Map<String, String> map);

    void setResizeProperties(Map<String, String> map);

    void storePicture(String str);

    void useCustomClose(String str);
}
