package defpackage;

import android.graphics.Picture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v5o extends saj implements Function1<Picture, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Picture picture) {
        Picture picture2 = picture;
        picture2.getClass();
        q5o q5oVar = (q5o) this.receiver;
        q5oVar.s0();
        String strY1 = q5oVar.q0().y1();
        if (strY1 != null) {
            ibs viewLifecycleOwner = q5oVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new c6o(q5oVar, picture2, strY1, null), 3);
        }
        return Unit.a;
    }
}
