package com.bytedance.sdk.component.adexpress.dynamic.vy;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.material.timepicker.h;
import fw.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    public static final Map<String, Integer> hww;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f34231hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private hu f34232hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f34233sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34234tq;
    private hu vy;

    static {
        HashMap map = new HashMap();
        hww = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put(MediaTrack.ROLE_SUBTITLE, 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put(h.f51923u, 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public int hu() {
        return this.vy.gsa();
    }

    public hu hv() {
        return this.vy;
    }

    public int hww() {
        if (TextUtils.isEmpty(this.f34234tq)) {
            return 0;
        }
        if (this.f34234tq.equals("logo")) {
            String str = this.f34234tq + this.f34233sd;
            this.f34234tq = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f34234tq.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = hww;
        if (map.get(this.f34234tq) != null) {
            return map.get(this.f34234tq).intValue();
        }
        return -1;
    }

    public String sd() {
        return this.f34233sd;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f34234tq + "', data='" + this.f34233sd + "', value=" + this.vy + ", themeValue=" + this.f34232hv + ", dataExtraInfo='" + this.f34231hu + '\'' + b.f85383j;
    }

    public String tq() {
        return this.f34234tq;
    }

    public hu vgm() {
        return this.f34232hv;
    }

    public String vy() {
        return this.f34231hu;
    }

    public void sd(String str) {
        this.f34231hu = str;
    }

    public void tq(String str) {
        this.f34233sd = str;
    }

    public void tq(hu huVar) {
        this.f34232hv = huVar;
    }

    public void hww(String str) {
        this.f34234tq = str;
    }

    public void hww(hu huVar) {
        this.vy = huVar;
    }
}
