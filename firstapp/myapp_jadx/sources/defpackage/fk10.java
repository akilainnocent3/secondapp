package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {351, 158}, m = "invokeSuspend")
public final class fk10 extends tje0 implements Function2<TextClassifier, v1b<? super ulf0>, Object> {
    public tuw a;
    public gk10 b;
    public CharSequence c;
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CharSequence i;
    public final /* synthetic */ long v;
    public final /* synthetic */ gk10 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk10(CharSequence charSequence, long j, gk10 gk10Var, v1b<? super fk10> v1bVar) {
        super(2, v1bVar);
        this.i = charSequence;
        this.v = j;
        this.w = gk10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fk10 fk10Var = new fk10(this.i, this.v, this.w, v1bVar);
        fk10Var.f = obj;
        return fk10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextClassifier textClassifier, v1b<? super ulf0> v1bVar) {
        return ((fk10) create(zj10.a(textClassifier), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        TextSelection textSelection;
        gk10 gk10Var;
        CharSequence charSequence;
        tuw tuwVar;
        y5b y5bVar = y5b.a;
        int i = this.e;
        if (i == 0) {
            uj50.b(obj);
            TextClassifier textClassifierA = zj10.a(this.f);
            long j2 = this.v;
            int iF = ulf0.f(j2);
            int iE = ulf0.e(j2);
            CharSequence charSequence2 = this.i;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            gk10 gk10Var2 = this.w;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(gk10Var2.e());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierA.suggestSelection(defaultLocales.build());
            long jA = vlf0.a(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.d = jA;
                this.e = 2;
                if (gk10Var2.d(this.i, jA, textClassifierA, this) != y5bVar) {
                    j = jA;
                }
            } else {
                tuw tuwVar2 = gk10Var2.e;
                this.f = textSelectionSuggestSelection;
                this.a = tuwVar2;
                this.b = gk10Var2;
                this.c = charSequence2;
                this.d = jA;
                this.e = 1;
                if (tuwVar2.d(this) != y5bVar) {
                    textSelection = textSelectionSuggestSelection;
                    gk10Var = gk10Var2;
                    charSequence = charSequence2;
                    tuwVar = tuwVar2;
                    j = jA;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((x5a0) gk10Var.g).setValue(new udf0(charSequence, j, textClassification));
                    Unit unit = Unit.a;
                }
            }
            return y5bVar;
        }
        if (i == 1) {
            j = this.d;
            charSequence = this.c;
            gk10Var = this.b;
            tuwVar = this.a;
            textSelection = (TextSelection) this.f;
            uj50.b(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((x5a0) gk10Var.g).setValue(new udf0(charSequence, j, textClassification2));
                Unit unit2 = Unit.a;
            } finally {
                tuwVar.f(null);
            }
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.d;
            uj50.b(obj);
        }
        return new ulf0(j);
    }
}
