package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class yyp {
    public Function1<? super v1b<? super Unit>, ? extends Object> a = new a(1, null);

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNBetListScrollController$expandCollapsibleContentAction$1", f = "LNBetListView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(1, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }
}
