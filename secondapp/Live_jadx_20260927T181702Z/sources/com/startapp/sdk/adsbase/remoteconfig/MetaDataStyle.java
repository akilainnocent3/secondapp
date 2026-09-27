package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class MetaDataStyle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f74437a = new HashSet(Arrays.asList("BOLD"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f74438b = 14;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f74439c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f74440d = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private String name = "";
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;
    private Integer itemTitleTextSize = 18;
    private Integer itemTitleTextColor = -1;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f74437a;
    private Integer itemDescriptionTextSize = f74438b;
    private Integer itemDescriptionTextColor = f74439c;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f74440d;

    public final Integer a() {
        return this.itemDescriptionTextColor;
    }

    public final Set b() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer c() {
        return this.itemDescriptionTextSize;
    }

    public final Integer d() {
        return this.itemGradientBottom;
    }

    public final Integer e() {
        return this.itemGradientTop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
            if (si.a((Object) this.name, (Object) metaDataStyle.name) && si.a((Object) this.itemGradientTop, (Object) metaDataStyle.itemGradientTop) && si.a((Object) this.itemGradientBottom, (Object) metaDataStyle.itemGradientBottom) && si.a((Object) this.itemTitleTextSize, (Object) metaDataStyle.itemTitleTextSize) && si.a((Object) this.itemTitleTextColor, (Object) metaDataStyle.itemTitleTextColor) && si.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) && si.a((Object) this.itemDescriptionTextSize, (Object) metaDataStyle.itemDescriptionTextSize) && si.a((Object) this.itemDescriptionTextColor, (Object) metaDataStyle.itemDescriptionTextColor) && si.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
                return true;
            }
        }
        return false;
    }

    public final Integer f() {
        return this.itemTitleTextColor;
    }

    public final Set g() {
        return this.itemTitleTextDecoration;
    }

    public final Integer h() {
        return this.itemTitleTextSize;
    }

    public final int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
