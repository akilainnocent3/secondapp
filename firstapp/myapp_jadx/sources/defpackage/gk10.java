package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gk10 implements vj10 {
    public final CoroutineContext a;
    public final Context b;
    public final q780 c;
    public final cet d;
    public TextClassifier f;
    public final tuw e = uuw.a();
    public final ytw g = m.b(null);
    public final Object h = new Object();

    public gk10(CoroutineContext coroutineContext, Context context, q780 q780Var, cet cetVar) {
        this.a = coroutineContext;
        this.b = context;
        this.c = q780Var;
        this.d = cetVar;
    }

    @Override // defpackage.vj10
    public final Object a(String str, long j, jif0 jif0Var) {
        if (str.length() == 0 || ulf0.c(j)) {
            return Unit.a;
        }
        return ej5.d(this.a, new bk10(this, new ak10(this, str, j, null), null), jif0Var);
    }

    @Override // defpackage.vj10
    public final Object b(CharSequence charSequence, long j, iif0.a aVar) {
        if (charSequence.length() == 0 || ulf0.c(j)) {
            return null;
        }
        return ej5.d(this.a, new bk10(this, new fk10(charSequence, j, this, null), null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public final void c(xdf0 xdf0Var, String str, long j, rif0 rif0Var) {
        TextClassification textClassification;
        tuw tuwVar = this.e;
        TextClassification textClassification2 = null;
        if (tuwVar.g()) {
            udf0 udf0Var = (udf0) ((x5a0) this.g).getValue();
            if (udf0Var != null) {
                qyd0 qyd0Var = jk10.a;
                if (ulf0.b(j, udf0Var.b) && Intrinsics.g(str, udf0Var.a)) {
                    textClassification = udf0Var.c;
                } else {
                    textClassification = null;
                }
            } else {
                textClassification = null;
            }
            tuwVar.f(null);
            textClassification2 = textClassification;
        }
        if (textClassification2 == null) {
            rif0Var.invoke(xdf0Var);
            return;
        }
        boolean zIsEmpty = textClassification2.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            xdf0Var.a.g(new uef0(obj, textClassification2, 0));
        } else if ((textClassification2.getIcon() != null || !TextUtils.isEmpty(textClassification2.getLabel())) && (textClassification2.getIntent() != null || textClassification2.getOnClickListener() != null)) {
            xdf0Var.a.g(new uef0(obj, textClassification2, -1));
        }
        rif0Var.invoke(xdf0Var);
        List<RemoteAction> actions = textClassification2.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                xdf0Var.a.g(new uef0(obj, textClassification2, i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(CharSequence charSequence, long j, TextClassifier textClassifier, x1b x1bVar) {
        yj10 yj10Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        tuw tuwVar;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        if (x1bVar instanceof yj10) {
            yj10Var = (yj10) x1bVar;
            int i = yj10Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yj10Var.i = i - Integer.MIN_VALUE;
            } else {
                yj10Var = new yj10(this, x1bVar);
            }
        } else {
            yj10Var = new yj10(this, x1bVar);
        }
        Object obj = yj10Var.e;
        y5b y5bVar = y5b.a;
        int i2 = yj10Var.i;
        ytw ytwVar = this.g;
        tuw tuwVar2 = this.e;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                yj10Var.a = charSequence;
                yj10Var.b = textClassifier;
                yj10Var.c = tuwVar2;
                j2 = j;
                yj10Var.d = j2;
                yj10Var.i = 1;
                if (tuwVar2.d(yj10Var) != y5bVar) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    tuwVar = tuwVar2;
                }
                return y5bVar;
            }
            if (i2 == 1) {
                j2 = yj10Var.d;
                tuwVar = yj10Var.c;
                textClassifier2 = (TextClassifier) yj10Var.b;
                charSequence2 = yj10Var.a;
                uj50.b(obj);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = yj10Var.d;
                tuwVar2 = yj10Var.c;
                textClassificationClassifyText = (TextClassification) yj10Var.b;
                charSequence3 = yj10Var.a;
                uj50.b(obj);
            }
            try {
                ((x5a0) ytwVar).setValue(new udf0(charSequence3, j3, textClassificationClassifyText));
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                tuwVar2.f(null);
            }
            udf0 udf0Var = (udf0) ((x5a0) ytwVar).getValue();
            if (udf0Var != null) {
                qyd0 qyd0Var = jk10.a;
                if (ulf0.b(j2, udf0Var.b) && Intrinsics.g(charSequence2, udf0Var.a)) {
                    Unit unit2 = Unit.a;
                    tuwVar.f(null);
                    return unit2;
                }
            }
            Unit unit3 = Unit.a;
            tuwVar.f(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, ulf0.f(j2), ulf0.e(j2)).setDefaultLocales(e()).build());
            yj10Var.a = charSequence2;
            yj10Var.b = textClassificationClassifyText;
            yj10Var.c = tuwVar2;
            yj10Var.d = j2;
            yj10Var.i = 2;
            if (tuwVar2.d(yj10Var) != y5bVar) {
                j3 = j2;
                charSequence3 = charSequence2;
                ((x5a0) ytwVar).setValue(new udf0(charSequence3, j3, textClassificationClassifyText));
                Unit unit4 = Unit.a;
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            tuwVar.f(null);
            throw th;
        }
    }

    public final LocaleList e() {
        cet cetVar = this.d;
        if (cetVar == null) {
            return new LocaleList(hj10.a.a().b().a);
        }
        ArrayList arrayList = new ArrayList(l48.r(cetVar, 10));
        Iterator<bet> it = cetVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
