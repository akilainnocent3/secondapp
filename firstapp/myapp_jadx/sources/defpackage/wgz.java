package defpackage;

import androidx.compose.ui.layout.x;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.layout.z;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface wgz extends j620 {

    public interface a {
        void h();
    }

    void A();

    void B(tsr tsrVar, boolean z, boolean z2, boolean z3);

    void C();

    void a(boolean z);

    long b(long j);

    void c(tsr tsrVar);

    void e(tt1.b bVar);

    void f(tsr tsrVar);

    n6 getAccessibilityManager();

    ol1 getAutofill();

    yl1 getAutofillManager();

    am1 getAutofillTree();

    ms7 getClipboard();

    ns7 getClipboardManager();

    CoroutineContext getCoroutineContext();

    mmd getDensity();

    n7f getDragAndDropManager();

    s4i getFocusOwner();

    f8i.a getFontFamilyResolver();

    z7i.a getFontLoader();

    t6l getGraphicsContext();

    zdl getHapticFeedBack();

    gmn getInputModeManager();

    asr getLayoutDirection();

    k3w getModifierLocalManager();

    default w7z getOutOfFrameExecutor() {
        return null;
    }

    default y.a getPlacementScope() {
        z.a aVar = z.a;
        return new x(this);
    }

    i020 getPointerIconService();

    rk40 getRectManager();

    tsr getRoot();

    fb80 getSemanticsOwner();

    wsr getSharedDrawScope();

    boolean getShowLayoutBounds();

    ghz getSnapshotObserver();

    ooa0 getSoftwareKeyboardController();

    ujf0 getTextInputService();

    jmf0 getTextToolbar();

    z6i0 getViewConfiguration();

    a8j0 getWindowInfo();

    void h(tsr tsrVar);

    void j(tsr tsrVar);

    void k(tsr tsrVar, boolean z);

    void l(tsr tsrVar);

    vgz m(Function2 function2, ywx.f fVar, v6l v6lVar);

    void n(tsr tsrVar);

    void p(tsr tsrVar);

    void r(tsr tsrVar, boolean z, boolean z2);

    void s(tsr tsrVar, long j);

    void setShowLayoutBounds(boolean z);

    long t(long j);

    void v(Function2 function2, x1b x1bVar);

    void x(Function0<Unit> function0);

    void z();

    default void q() {
    }

    default void u(float f) {
    }

    default void g(int i, tsr tsrVar) {
    }

    default void y(int i, tsr tsrVar) {
    }
}
