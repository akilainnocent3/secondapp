package com.inmobi.unifiedId;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class InMobiUserDataTypes {

    @m
    private final String md5;

    @m
    private final String sha1;

    @m
    private final String sha256;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nInMobiUserDataTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiUserDataTypes.kt\ncom/inmobi/unifiedId/InMobiUserDataTypes$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f58327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f58328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f58329c;

        @l
        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f58327a, this.f58328b, this.f58329c);
        }

        @l
        public final Builder md5(@m String str) {
            this.f58327a = str;
            return this;
        }

        @l
        public final Builder sha1(@m String str) {
            this.f58328b = str;
            return this;
        }

        @l
        public final Builder sha256(@m String str) {
            this.f58329c = str;
            return this;
        }
    }

    public InMobiUserDataTypes(@m String str, @m String str2, @m String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.md5;
    }

    @m
    public final String component2() {
        return this.sha1;
    }

    @m
    public final String component3() {
        return this.sha256;
    }

    @l
    public final InMobiUserDataTypes copy(@m String str, @m String str2, @m String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        return m0.g(this.md5, inMobiUserDataTypes.md5) && m0.g(this.sha1, inMobiUserDataTypes.sha1) && m0.g(this.sha256, inMobiUserDataTypes.sha256);
    }

    @m
    public final String getMd5() {
        return this.md5;
    }

    @m
    public final String getSha1() {
        return this.sha1;
    }

    @m
    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public String toString() {
        return "InMobiUserDataTypes(md5=" + this.md5 + ", sha1=" + this.sha1 + ", sha256=" + this.sha256 + j.f86771d;
    }
}
