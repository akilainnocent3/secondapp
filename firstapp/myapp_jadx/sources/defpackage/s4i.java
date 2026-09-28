package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface s4i extends k4i {
    Boolean a(int i, lk40 lk40Var, Function1<? super FocusTargetNode, Boolean> function1);

    void b(w3i w3iVar);

    boolean d(jw50 jw50Var, w40 w40Var);

    boolean e(KeyEvent keyEvent);

    FocusTargetNode f();

    boolean g(a80 a80Var, AndroidComposeView.f fVar);

    void h(FocusTargetNode focusTargetNode);

    void i();

    FocusOwnerImpl$modifier$1 j();

    boolean k(KeyEvent keyEvent, Function0<Boolean> function0);

    boolean l();

    k5i m();

    boolean n();

    lk40 o();

    boolean p(int i, boolean z, boolean z2);

    void q(FocusTargetNode focusTargetNode);

    void r();

    etw<j4i> s();
}
