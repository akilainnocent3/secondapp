package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sg4[], still in use, count: 1, list:
  (r0v1 sg4[]) from 0x0038: CONSTRUCTOR (r1v2 uag) = (r0v1 sg4[]) A[MD:(T extends java.lang.Enum<T>[]):void (m)] (LINE:57) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class sg4 implements nrm, orm {
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawBankPartialRateParam(BOConfigParam.PartialBankWithdraw, "bank"),
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawMomoPartialRateParam(BOConfigParam.PartialMobileMoneyWithdraw, "mobilemoney"),
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawPartnerPartialRateParam(BOConfigParam.PartialPartnerWithdraw, "offline"),
    /* JADX INFO: Fake field, exist only in values array */
    WithdrawTransferPartialRateParam(BOConfigParam.PartialTransferToFriendWithdraw, "transfer");

    public static final a c;
    public static final List<BOConfigParam> d;
    public static final List<String> e;
    public static final /* synthetic */ uag i;
    public final BOConfigParam a;
    public final String b;

    public static final class a {
    }

    static {
        uag uagVar = new uag(sg4VarArr);
        i = uagVar;
        c = new a();
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            arrayList.add(((sg4) bVar.next()).a);
        }
        d = CollectionsKt.A0(arrayList);
        uag uagVar2 = i;
        ArrayList arrayList2 = new ArrayList(l48.r(uagVar2, 10));
        q3.b bVar2 = new q3.b();
        while (bVar2.hasNext()) {
            arrayList2.add(((sg4) bVar2.next()).b);
        }
        e = CollectionsKt.A0(arrayList2);
    }

    public sg4(BOConfigParam bOConfigParam, String str) {
        super(str, i);
        this.a = bOConfigParam;
        this.b = str;
    }

    public static sg4 valueOf(String str) {
        return (sg4) Enum.valueOf(sg4.class, str);
    }

    public static sg4[] values() {
        return (sg4[]) f.clone();
    }

    @Override // defpackage.nrm
    public final BOConfigParam a() {
        return this.a;
    }

    @Override // defpackage.orm
    public final String b() {
        return this.b;
    }
}
