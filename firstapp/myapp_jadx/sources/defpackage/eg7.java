package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatScreenKt$ChatSheetContent$1$1", f = "ChatScreen.kt", l = {277}, m = "invokeSuspend", v = 1)
public final class eg7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pxy b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg7(pxy pxyVar, String str, v1b<? super eg7> v1bVar) {
        super(2, v1bVar);
        this.b = pxyVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eg7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((eg7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            pxy pxyVar = this.b;
            pxyVar.getClass();
            ej5.c(o8i0.d(pxyVar), null, null, new nxy(pxyVar, this.c, null), 3);
            this.a = 1;
        } while (hkd.b(15000L, this) != y5bVar);
        return y5bVar;
    }
}
