package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.sms.SmsViewModel$parseSMS$1", f = "SmsViewModel.kt", l = {270}, m = "invokeSuspend", v = 2)
public final class z2a0 extends tje0 implements Function2<myh<? super uf00<? extends d08.b>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2a0(String str, v1b<? super z2a0> v1bVar) {
        super(2, v1bVar);
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z2a0 z2a0Var = new z2a0(this.c, v1bVar);
        z2a0Var.b = obj;
        return z2a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uf00<? extends d08.b>> myhVar, v1b<? super Unit> v1bVar) {
        return ((z2a0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String value;
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            MatchResult matchResult = (MatchResult) CollectionsKt.firstOrNull(ld80.k(Regex.c(new Regex("\\b\\d{6}\\b"), this.c)));
            if (matchResult != null && (value = matchResult.getValue()) != null) {
                char[] charArray = value.toCharArray();
                charArray.getClass();
                List<Character> listN = ay0.N(charArray);
                if (listN != null) {
                    ArrayList arrayList = new ArrayList(l48.r(listN, 10));
                    Iterator<T> it = listN.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new d08.b(((Character) it.next()).charValue()));
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    if (uf00VarF != null) {
                        this.b = null;
                        this.a = 1;
                        if (myhVar.emit(uf00VarF, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
            }
            fm20.a();
            return null;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        return Unit.a;
    }
}
