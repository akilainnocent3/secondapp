package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ve implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96616c;

    public Ve(@oy.l Context context, @oy.l String str, @oy.l String str2) {
        this.f96614a = context;
        this.f96615b = str;
        this.f96616c = str2;
    }

    @oy.l
    public final Ve a(@oy.l Context context, @oy.l String str, @oy.l String str2) {
        return new Ve(context, str, str2);
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ve)) {
            return false;
        }
        Ve ve2 = (Ve) obj;
        return kotlin.jvm.internal.m0.g(this.f96614a, ve2.f96614a) && kotlin.jvm.internal.m0.g(this.f96615b, ve2.f96615b) && kotlin.jvm.internal.m0.g(this.f96616c, ve2.f96616c);
    }

    public final int hashCode() {
        return this.f96616c.hashCode() + ((this.f96615b.hashCode() + (this.f96614a.hashCode() * 31)) * 31);
    }

    @oy.l
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f96614a + ", prefName=" + this.f96615b + ", prefValueName=" + this.f96616c + ')';
    }

    public static Ve a(Ve ve2, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = ve2.f96614a;
        }
        if ((i10 & 2) != 0) {
            str = ve2.f96615b;
        }
        if ((i10 & 4) != 0) {
            str2 = ve2.f96616c;
        }
        ve2.getClass();
        return new Ve(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Sc
    @oy.l
    public final String a() {
        String string = this.f96614a.getSharedPreferences(this.f96615b, 0).getString(this.f96616c, "");
        return string == null ? "" : string;
    }
}
