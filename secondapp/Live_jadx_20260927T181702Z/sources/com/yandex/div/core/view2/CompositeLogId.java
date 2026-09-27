package com.yandex.div.core.view2;

import dr.i0;
import dr.k0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CompositeLogId {

    @oy.l
    private final String actionLogId;

    @oy.l
    private final i0 compositeLogId$delegate = k0.b(new CompositeLogId$compositeLogId$2(this));

    @oy.l
    private final String dataTag;

    @oy.l
    private final String scopeLogId;

    public CompositeLogId(@oy.l String str, @oy.l String str2, @oy.l String str3) {
        this.dataTag = str;
        this.scopeLogId = str2;
        this.actionLogId = str3;
    }

    public static /* synthetic */ CompositeLogId copy$default(CompositeLogId compositeLogId, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = compositeLogId.dataTag;
        }
        if ((i10 & 2) != 0) {
            str2 = compositeLogId.scopeLogId;
        }
        if ((i10 & 4) != 0) {
            str3 = compositeLogId.actionLogId;
        }
        return compositeLogId.copy(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = '#' + this.scopeLogId;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.actionLogId);
        return sb2.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId$delegate.getValue();
    }

    @oy.l
    public final String component1() {
        return this.dataTag;
    }

    @oy.l
    public final String component2() {
        return this.scopeLogId;
    }

    @oy.l
    public final String component3() {
        return this.actionLogId;
    }

    @oy.l
    public final CompositeLogId copy(@oy.l String str, @oy.l String str2, @oy.l String str3) {
        return new CompositeLogId(str, str2, str3);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return m0.g(this.dataTag, compositeLogId.dataTag) && m0.g(this.scopeLogId, compositeLogId.scopeLogId) && m0.g(this.actionLogId, compositeLogId.actionLogId);
    }

    @oy.l
    public final String getActionLogId() {
        return this.actionLogId;
    }

    @oy.l
    public final String getDataTag() {
        return this.dataTag;
    }

    @oy.l
    public final String getScopeLogId() {
        return this.scopeLogId;
    }

    public int hashCode() {
        return (((this.dataTag.hashCode() * 31) + this.scopeLogId.hashCode()) * 31) + this.actionLogId.hashCode();
    }

    @oy.l
    public String toString() {
        return getCompositeLogId();
    }
}
