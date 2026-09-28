package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomHeaderKt$CodeChatRoomHeaderCard$1$1", f = "CodeChatRoomHeader.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uv7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zv7 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv7(zv7 zv7Var, String str, v1b<? super uv7> v1bVar) {
        super(2, v1bVar);
        this.a = zv7Var;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uv7(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uv7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zv7 zv7Var = this.a;
        zv7Var.getClass();
        String str = this.b;
        str.getClass();
        jvd0 jvd0Var = zv7Var.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        wwd0 wwd0Var = zv7Var.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, xv7.a((xv7) value, str, true, 0, 0, m2g.a, 4)));
        zv7Var.d = ej5.c(o8i0.d(zv7Var), null, null, new yv7(zv7Var, str, null), 3);
        return Unit.a;
    }
}
