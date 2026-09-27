package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC18118z {
    void A59(C3460qI c3460qI, int i10, int[] iArr) throws C18068s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z10);

    C3439px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j10, int i10) throws C18108y, C18078t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C18108y;

    void AJG(C3466qQ c3466qQ);

    void AJH(int i10);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z10);

    void AJV(InterfaceC18088v interfaceC18088v);

    void AJd(C3439px c3439px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z10);

    boolean AKN(C3460qI c3460qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i10, int i11);

    void flush();

    void pause();

    void setVolume(float f10);
}
