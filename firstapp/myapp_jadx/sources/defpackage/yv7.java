package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomHeaderViewModel$load$2", f = "CodeChatRoomHeaderViewModel.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class yv7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zv7 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv7(zv7 zv7Var, String str, v1b<? super yv7> v1bVar) {
        super(2, v1bVar);
        this.c = zv7Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yv7 yv7Var = new yv7(this.c, this.d, v1bVar);
        yv7Var.b = obj;
        return yv7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yv7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        xv7 xv7VarA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.d;
        zv7 zv7Var = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                n4k n4kVar = zv7Var.a;
                this.b = null;
                this.a = 1;
                obj = n4kVar.a(str, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (n4k.a) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        n4k.a aVar4 = (n4k.a) (bVar instanceof zi50.b ? null : bVar);
        wwd0 wwd0Var = zv7Var.b;
        do {
            value = wwd0Var.getValue();
            xv7VarA = (xv7) value;
            if (Intrinsics.g(xv7VarA.a, str)) {
                xv7VarA = aVar4 == null ? xv7.a(xv7VarA, null, false, 0, 0, null, 61) : xv7.a(xv7VarA, null, false, aVar4.a, aVar4.b, aVar4.c, 5);
            }
        } while (!wwd0Var.g(value, xv7VarA));
        return Unit.a;
    }
}
