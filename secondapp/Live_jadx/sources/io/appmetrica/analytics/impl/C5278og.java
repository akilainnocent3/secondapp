package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5278og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC5253ng f98077d;

    public C5278og(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C5303pg c5303pgA = C5303pg.a(bArr);
        this.f98074a = c5303pgA.f98143a;
        this.f98075b = c5303pgA.f98145c;
        this.f98076c = c5303pgA.f98144b;
        this.f98077d = a(c5303pgA.f98146d);
    }

    public final byte[] a() {
        C5303pg c5303pg = new C5303pg();
        c5303pg.f98143a = this.f98074a;
        c5303pg.f98145c = this.f98075b;
        c5303pg.f98144b = this.f98076c;
        int iOrdinal = this.f98077d.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 0;
            }
        }
        c5303pg.f98146d = i10;
        return MessageNano.toByteArray(c5303pg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5278og.class == obj.getClass()) {
            C5278og c5278og = (C5278og) obj;
            if (this.f98075b == c5278og.f98075b && this.f98076c == c5278og.f98076c && this.f98074a.equals(c5278og.f98074a) && this.f98077d == c5278og.f98077d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f98074a.hashCode() * 31;
        long j10 = this.f98075b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f98076c;
        return this.f98077d.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f98074a + "', referrerClickTimestampSeconds=" + this.f98075b + ", installBeginTimestampSeconds=" + this.f98076c + ", source=" + this.f98077d + fw.b.f85383j;
    }

    public C5278og(String str, long j10, long j11, EnumC5253ng enumC5253ng) {
        this.f98074a = str;
        this.f98075b = j10;
        this.f98076c = j11;
        this.f98077d = enumC5253ng;
    }

    public static EnumC5253ng a(int i10) {
        if (i10 == 1) {
            return EnumC5253ng.f97979c;
        }
        if (i10 != 2) {
            return EnumC5253ng.f97978b;
        }
        return EnumC5253ng.f97980d;
    }
}
