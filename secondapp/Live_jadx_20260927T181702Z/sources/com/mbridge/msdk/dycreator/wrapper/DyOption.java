package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f66594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f66595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f66596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f66597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f66598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f66599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f66600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f66608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f66609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f66610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f66611r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f66612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f66613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f66614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f66615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f66616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f66617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f66618g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f66619h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f66620i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f66621j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f66622k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f66623l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f66624m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f66625n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f66626o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f66627p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f66617f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f66614c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f66616e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f66626o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f66615d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f66613b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f66612a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f66621j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f66619h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f66622k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f66618g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f66620i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f66625n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f66623l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f66624m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f66627p = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f66594a = builder.f66612a;
        this.f66595b = builder.f66613b;
        this.f66596c = builder.f66614c;
        this.f66597d = builder.f66615d;
        this.f66600g = builder.f66616e;
        this.f66598e = builder.f66617f;
        this.f66599f = builder.f66618g;
        this.f66601h = builder.f66619h;
        this.f66603j = builder.f66621j;
        this.f66602i = builder.f66620i;
        this.f66604k = builder.f66622k;
        this.f66605l = builder.f66623l;
        this.f66606m = builder.f66624m;
        this.f66607n = builder.f66625n;
        this.f66608o = builder.f66626o;
        this.f66610q = builder.f66627p;
    }

    public String getAdChoiceLink() {
        return this.f66598e;
    }

    public CampaignEx getCampaignEx() {
        return this.f66596c;
    }

    public int getCountDownTime() {
        return this.f66608o;
    }

    public int getCurrentCountDown() {
        return this.f66609p;
    }

    public DyAdType getDyAdType() {
        return this.f66597d;
    }

    public File getFile() {
        return this.f66595b;
    }

    public List<String> getFileDirs() {
        return this.f66594a;
    }

    public int getOrientation() {
        return this.f66607n;
    }

    public int getShakeStrenght() {
        return this.f66605l;
    }

    public int getShakeTime() {
        return this.f66606m;
    }

    public int getTemplateType() {
        return this.f66610q;
    }

    public boolean isApkInfoVisible() {
        return this.f66603j;
    }

    public boolean isCanSkip() {
        return this.f66600g;
    }

    public boolean isClickButtonVisible() {
        return this.f66601h;
    }

    public boolean isClickScreen() {
        return this.f66599f;
    }

    public boolean isLogoVisible() {
        return this.f66604k;
    }

    public boolean isShakeVisible() {
        return this.f66602i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f66611r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f66609p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f66611r = dyCountDownListenerWrapper;
    }
}
