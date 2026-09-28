package defpackage;

import android.view.ViewTreeObserver;
import com.google.protobuf.Reader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z97 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ aa7.a a;

    public z97(aa7.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        k2p k2pVar = this.a.b;
        if (k2pVar == null) {
            Intrinsics.n("itemChatBinding");
            throw null;
        }
        if (k2pVar.c.getLineCount() > 2) {
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.c.setMaxLines(2);
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.f.setVisibility(0);
        } else {
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.c.setMaxLines(Reader.READ_DONE);
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.f.setVisibility(8);
        }
        if (k2pVar != null) {
            k2pVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
        Intrinsics.n("itemChatBinding");
        throw null;
    }
}
