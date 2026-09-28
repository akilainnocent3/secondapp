package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF106' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class rg4 implements nrm, orm {
    public static final a c;
    public static final List<BOConfigParam> d;
    public static final List<String> e;
    public static final /* synthetic */ rg4[] f;
    public static final /* synthetic */ uag i;
    public final BOConfigParam a;
    public final String b;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF3;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF4;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF5;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF6;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF7;

    /* JADX INFO: Fake field, exist only in values array */
    rg4 EF106;

    public static final class a {
    }

    static {
        rg4 rg4Var = new rg4("DepositMomoPartialRateParam", 0, BOConfigParam.PartialMobileMoneyDeposit, "mobilemoney");
        rg4 rg4Var2 = new rg4("DepositPaybillPartialRateParam", 1, BOConfigParam.PartialPaybillDeposit, "paybill");
        rg4 rg4Var3 = new rg4("DepositCardPartialRateParam", 2, BOConfigParam.PartialCardDeposit, "card");
        rg4 rg4Var4 = new rg4("DepositOthersPartialRateParam", 3, BOConfigParam.PartialOthersDeposit, "others");
        rg4 rg4Var5 = new rg4("DepositBankTransferPartialRateParam", 4, BOConfigParam.PartialBankTransferDeposit, "bank-transfer");
        rg4 rg4Var6 = new rg4("DepositSportyBankPartialRateParam", 5, BOConfigParam.PartialSportyBankAndroid, "sporty-bank");
        rg4 rg4Var7 = new rg4("DepositOtherBanksPartialRateParam", 6, BOConfigParam.PartialOtherBanksDeposit, "other-banks");
        rg4 rg4Var8 = new rg4("DepositEWalletOPayPartialRateParam", 7, BOConfigParam.PartialOpayDeposit, "opay");
        BOConfigParam bOConfigParam = BOConfigParam.PartialPalmpayDeposit;
        rg4[] rg4VarArr = {rg4Var, rg4Var2, rg4Var3, rg4Var4, rg4Var5, rg4Var6, rg4Var7, rg4Var8, new rg4("DepositEWalletPalmPayPartialRateParam", 8, bOConfigParam, "palmpay"), new rg4("DepositEWalletTENNPartialRateParam", 9, bOConfigParam, "tenn"), new rg4("DepositKudaPartialRateParam", 10, BOConfigParam.PartialKudaDeposit, "kuda")};
        f = rg4VarArr;
        uag uagVar = new uag(rg4VarArr);
        i = uagVar;
        c = new a();
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            arrayList.add(((rg4) bVar.next()).a);
        }
        d = CollectionsKt.A0(arrayList);
        uag uagVar2 = i;
        ArrayList arrayList2 = new ArrayList(l48.r(uagVar2, 10));
        q3.b bVar2 = new q3.b();
        while (bVar2.hasNext()) {
            arrayList2.add(((rg4) bVar2.next()).b);
        }
        e = CollectionsKt.A0(arrayList2);
    }

    public rg4(String str, int i2, BOConfigParam bOConfigParam, String str2) {
        super(str, i2);
        this.a = bOConfigParam;
        this.b = str2;
    }

    public static rg4 valueOf(String str) {
        return (rg4) Enum.valueOf(rg4.class, str);
    }

    public static rg4[] values() {
        return (rg4[]) f.clone();
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
