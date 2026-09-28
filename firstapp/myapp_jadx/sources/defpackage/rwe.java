package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rwe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rwe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        Object bVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(iwe.c.a);
                return Unit.a;
            case 1:
                Bundle arguments = ((r320) obj).getArguments();
                if (arguments == null || (string = arguments.getString("code_source")) == null) {
                    return null;
                }
                try {
                    zi50.a aVar = zi50.b;
                    bVar = g08.valueOf(string);
                    break;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                return (g08) (bVar instanceof zi50.b ? null : bVar);
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
