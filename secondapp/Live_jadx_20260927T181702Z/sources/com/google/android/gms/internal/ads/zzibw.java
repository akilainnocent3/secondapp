package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibv;
import com.google.android.gms.internal.ads.zzibw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzibw<MessageType extends zzibw<MessageType, BuilderType>, BuilderType extends zzibv<MessageType, BuilderType>> implements zzifc {
    protected transient int zzq = 0;

    public static void zzaV(zzicn zzicnVar) throws IllegalArgumentException {
        if (!zzicnVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzibv.zzaT(iterable, list);
    }

    private String zzdV(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb2.append("Serializing ");
        sb2.append(name);
        sb2.append(" to a ");
        sb2.append(str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public zzicn zzaM() {
        try {
            int iZzbr = zzbr();
            zzicn zzicnVar = zzicn.zza;
            byte[] bArr = new byte[iZzbr];
            int i10 = zzicw.zzb;
            zzict zzictVar = new zzict(bArr, 0, iZzbr);
            zzcX(zzictVar);
            return zzicj.zza(zzictVar, bArr);
        } catch (IOException e10) {
            throw new RuntimeException(zzdV("ByteString"), e10);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i10 = zzicw.zzb;
            zzict zzictVar = new zzict(bArr, 0, iZzbr);
            zzcX(zzictVar);
            zzictVar.zzI();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(zzdV("byte array"), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public void zzaO(OutputStream outputStream) throws IOException {
        zzicv zzicvVar = new zzicv(outputStream, zzicw.zzE(zzbr()));
        zzcX(zzicvVar);
        zzicvVar.zzx();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzicv zzicvVar = new zzicv(outputStream, zzicw.zzE(zzicw.zzF(iZzbr) + iZzbr));
        zzicvVar.zzr(iZzbr);
        zzcX(zzicvVar);
        zzicvVar.zzx();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i10) {
        throw new UnsupportedOperationException();
    }

    public zzifh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzifu zzifuVar) {
        return zzaQ();
    }

    public zzigg zzaU() {
        return new zzigg(this);
    }
}
