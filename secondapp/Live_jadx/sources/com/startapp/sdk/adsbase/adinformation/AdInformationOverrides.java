package com.startapp.sdk.adsbase.adinformation;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AdInformationOverrides implements Serializable {
    private static final long serialVersionUID = -5967960110869168470L;
    private boolean enableOverride = false;
    private boolean enable = true;
    private boolean positionOverride = false;

    @TypeInfo(type = AdInformationPositions.Position.class)
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.DEFAULT_POSITION);

    private AdInformationOverrides() {
    }

    public static AdInformationOverrides a() {
        return new AdInformationOverrides();
    }

    public final AdInformationPositions.Position b() {
        return this.position;
    }

    public final boolean c() {
        return this.enable;
    }

    public final boolean d() {
        return this.enableOverride;
    }

    public final boolean e() {
        return this.positionOverride;
    }

    public final void a(boolean z10) {
        this.enable = z10;
        this.enableOverride = true;
    }

    public final void a(AdInformationPositions.Position position) {
        this.position = position;
        if (position != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }
}
