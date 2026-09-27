package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f46787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f46791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f46792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f46793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f46794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f46795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f46796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f46797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f46798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f46799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f46800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f46801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f46802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f46803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f46804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f46805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f46806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f46807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f46808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f46809z;

    public o(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f46784a = str;
        this.f46788e = str2;
        this.f46789f = str3;
        this.f46786c = str4;
        this.f46785b = i10;
        this.f46790g = i11;
        this.f46793j = i12;
        this.f46794k = i13;
        this.f46795l = f10;
        this.f46796m = i14;
        this.f46797n = f11;
        this.f46799p = bArr;
        this.f46798o = i15;
        this.f46800q = cVar;
        this.f46801r = i16;
        this.f46802s = i17;
        this.f46803t = i18;
        this.f46804u = i19;
        this.f46805v = i20;
        this.f46807x = i21;
        this.f46808y = str5;
        this.f46809z = i22;
        this.f46806w = j10;
        this.f46791h = list == null ? Collections.EMPTY_LIST : list;
        this.f46792i = dVar;
        this.f46787d = bVar;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    public final int b() {
        int i10;
        int i11 = this.f46793j;
        if (i11 == -1 || (i10 = this.f46794k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f46785b == oVar.f46785b && this.f46790g == oVar.f46790g && this.f46793j == oVar.f46793j && this.f46794k == oVar.f46794k && this.f46795l == oVar.f46795l && this.f46796m == oVar.f46796m && this.f46797n == oVar.f46797n && this.f46798o == oVar.f46798o && this.f46801r == oVar.f46801r && this.f46802s == oVar.f46802s && this.f46803t == oVar.f46803t && this.f46804u == oVar.f46804u && this.f46805v == oVar.f46805v && this.f46806w == oVar.f46806w && this.f46807x == oVar.f46807x && z.a(this.f46784a, oVar.f46784a) && z.a(this.f46808y, oVar.f46808y) && this.f46809z == oVar.f46809z && z.a(this.f46788e, oVar.f46788e) && z.a(this.f46789f, oVar.f46789f) && z.a(this.f46786c, oVar.f46786c) && z.a(this.f46792i, oVar.f46792i) && z.a(this.f46787d, oVar.f46787d) && z.a(this.f46800q, oVar.f46800q) && Arrays.equals(this.f46799p, oVar.f46799p) && this.f46791h.size() == oVar.f46791h.size()) {
                for (int i10 = 0; i10 < this.f46791h.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.f46791h.get(i10), (byte[]) oVar.f46791h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f46784a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f46788e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f46789f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f46786c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f46785b) * 31) + this.f46793j) * 31) + this.f46794k) * 31) + this.f46801r) * 31) + this.f46802s) * 31;
            String str5 = this.f46808y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f46809z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f46792i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f46787d;
            this.A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f46748a) : 0);
        }
        return this.A;
    }

    public final String toString() {
        return "Format(" + this.f46784a + ", " + this.f46788e + ", " + this.f46789f + ", " + this.f46785b + ", " + this.f46808y + ", [" + this.f46793j + ", " + this.f46794k + ", " + this.f46795l + "], [" + this.f46801r + ", " + this.f46802s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46784a);
        parcel.writeString(this.f46788e);
        parcel.writeString(this.f46789f);
        parcel.writeString(this.f46786c);
        parcel.writeInt(this.f46785b);
        parcel.writeInt(this.f46790g);
        parcel.writeInt(this.f46793j);
        parcel.writeInt(this.f46794k);
        parcel.writeFloat(this.f46795l);
        parcel.writeInt(this.f46796m);
        parcel.writeFloat(this.f46797n);
        parcel.writeInt(this.f46799p != null ? 1 : 0);
        byte[] bArr = this.f46799p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f46798o);
        parcel.writeParcelable(this.f46800q, i10);
        parcel.writeInt(this.f46801r);
        parcel.writeInt(this.f46802s);
        parcel.writeInt(this.f46803t);
        parcel.writeInt(this.f46804u);
        parcel.writeInt(this.f46805v);
        parcel.writeInt(this.f46807x);
        parcel.writeString(this.f46808y);
        parcel.writeInt(this.f46809z);
        parcel.writeLong(this.f46806w);
        int size = this.f46791h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.f46791h.get(i11));
        }
        parcel.writeParcelable(this.f46792i, 0);
        parcel.writeParcelable(this.f46787d, 0);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i10, i11, i12, i13, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i17, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i10, String str3, int i11, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j10, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f46789f);
        String str = this.f46808y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f46790g);
        a(mediaFormat, "width", this.f46793j);
        a(mediaFormat, "height", this.f46794k);
        float f10 = this.f46795l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f46796m);
        a(mediaFormat, "channel-count", this.f46801r);
        a(mediaFormat, "sample-rate", this.f46802s);
        a(mediaFormat, "encoder-delay", this.f46804u);
        a(mediaFormat, "encoder-padding", this.f46805v);
        for (int i10 = 0; i10 < this.f46791h.size(); i10++) {
            mediaFormat.setByteBuffer(m.a("csd-", i10), ByteBuffer.wrap((byte[]) this.f46791h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f46800q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f47195c);
            a(mediaFormat, "color-standard", cVar.f47193a);
            a(mediaFormat, "color-range", cVar.f47194b);
            byte[] bArr = cVar.f47196d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public o(Parcel parcel) {
        this.f46784a = parcel.readString();
        this.f46788e = parcel.readString();
        this.f46789f = parcel.readString();
        this.f46786c = parcel.readString();
        this.f46785b = parcel.readInt();
        this.f46790g = parcel.readInt();
        this.f46793j = parcel.readInt();
        this.f46794k = parcel.readInt();
        this.f46795l = parcel.readFloat();
        this.f46796m = parcel.readInt();
        this.f46797n = parcel.readFloat();
        this.f46799p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f46798o = parcel.readInt();
        this.f46800q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f46801r = parcel.readInt();
        this.f46802s = parcel.readInt();
        this.f46803t = parcel.readInt();
        this.f46804u = parcel.readInt();
        this.f46805v = parcel.readInt();
        this.f46807x = parcel.readInt();
        this.f46808y = parcel.readString();
        this.f46809z = parcel.readInt();
        this.f46806w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f46791h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46791h.add(parcel.createByteArray());
        }
        this.f46792i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f46787d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
