package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "awaitFirstRightClickDown")
public final class gt50 extends x1b {
    public vp1 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return i0a.a(null, this);
    }
}
