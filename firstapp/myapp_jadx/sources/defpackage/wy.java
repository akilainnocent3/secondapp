package defpackage;

import com.sporty.android.core.antest.room.AnTestOverrideDB_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wy implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new lvh0((AnTestOverrideDB_Impl) obj);
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
