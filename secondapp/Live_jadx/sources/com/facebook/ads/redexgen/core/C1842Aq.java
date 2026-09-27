package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vungle.ads.internal.signals.SignalKey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1842Aq implements InterfaceC3512rQ {
    public static byte[] A05;
    public final WeakReference<View> A00;
    public final InterfaceC3516rY A03;
    public final List<Rect> A04 = new ArrayList();
    public final Rect A02 = new Rect();
    public final Rect A01 = new Rect();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-21, -23, -8, a.f103484u7, -16, -19, -12, -42, -23, -25, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A02(List<Rect> list) {
        list.clear();
        this.A04.clear();
        View view = this.A00.get();
        if (view == null || !view.getGlobalVisibleRect(this.A02) || this.A02.isEmpty()) {
            return;
        }
        this.A04.add(this.A02);
        if (0 < this.A03.size()) {
            this.A03.A6i(0);
            throw new NullPointerException(A00(0, 11, SignalKey.EVENT_ID));
        }
        list.addAll(this.A04);
    }

    public C1842Aq(View view, InterfaceC3516rY interfaceC3516rY) {
        this.A00 = new WeakReference<>(view);
        this.A03 = interfaceC3516rY;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3512rQ
    public final Context A7U() {
        View view = this.A00.get();
        if (view == null) {
            return null;
        }
        return view.getContext();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3512rQ
    public final void A9Z(List<Rect> outList) {
        A02(outList);
    }
}
