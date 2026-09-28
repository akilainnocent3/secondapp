package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jah0 {
    public static final ResourceUiText a;
    public static final ResourceUiText b;
    public static final ResourceUiText c;
    public static final ResourceUiText d;
    public static final ResourceUiText e;
    public static final ResourceUiText f;
    public static final ResourceUiText g;
    public static final ResourceUiText h;
    public static final ResourceUiText i;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a implements brm {
        public static final /* synthetic */ a[] c;
        public static final /* synthetic */ uag d;
        public final String a;
        public final UiText b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF7;

        static {
            StringUiText stringUiText = vch0.a;
            a[] aVarArr = {new a("TIGO", 0, "TIGO", stringUiText), new a("VODACOM", 1, "Vodacom", stringUiText), new a("AIRTEL", 2, "Airtel", stringUiText)};
            c = aVarArr;
            d = new uag(aVarArr);
        }

        public a(String str, int i, String str2, UiText uiText) {
            super(str, i);
            this.a = str2;
            this.b = uiText;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        @Override // defpackage.brm
        public final String a() {
            return this.a;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jah0$b[], still in use, count: 1, list:
      (r0v1 jah0$b[]) from 0x003d: CONSTRUCTOR (r0v1 jah0$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:62) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    public static final class b implements mym {
        TIGO("TIGO", R.drawable.tigo_icon, jah0.d, jah0.a),
        /* JADX INFO: Fake field, exist only in values array */
        VODACOM("Vodacom", R.drawable.vodacom_icon, jah0.e, jah0.b),
        /* JADX INFO: Fake field, exist only in values array */
        AIRTEL("Airtel", R.drawable.airtel, jah0.f, jah0.c);

        public static final /* synthetic */ uag i;
        public final String a;
        public final int b;
        public final UiText c;
        public final UiText d;

        static {
            i = new uag(bVarArr);
        }

        public b(String str, int i2, UiText uiText, UiText uiText2) {
            super(str, i);
            this.a = str;
            this.b = i2;
            this.c = uiText;
            this.d = uiText2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        @Override // defpackage.mym
        public final String a() {
            return this.a;
        }

        @Override // defpackage.mym
        public final UiText b() {
            return this.c;
        }

        @Override // defpackage.mym
        public final int c() {
            return this.b;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jah0$c[], still in use, count: 1, list:
      (r0v1 jah0$c[]) from 0x0032: CONSTRUCTOR (r0v1 jah0$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:51) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    public static final class c implements szm {
        /* JADX INFO: Fake field, exist only in values array */
        TIGO("TIGO", jah0.a, jah0.g),
        /* JADX INFO: Fake field, exist only in values array */
        VODACOM("Vodacom", jah0.b, jah0.h),
        /* JADX INFO: Fake field, exist only in values array */
        AIRTEL("Airtel", jah0.c, jah0.i);

        public static final /* synthetic */ uag e;
        public final String a;
        public final UiText b;
        public final UiText c;

        static {
            e = new uag(cVarArr);
        }

        public c(String str, UiText uiText, UiText uiText2) {
            super(str, i);
            this.a = str;
            this.b = uiText;
            this.c = uiText2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }

        @Override // defpackage.szm
        public final String a() {
            return this.a;
        }
    }

    static {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_payment_providers__tigo_ussd_number__TZ);
        a = resourceUiText;
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_payment_providers__vodacom_ussd_number__TZ);
        b = resourceUiText2;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_number__TZ);
        c = resourceUiText3;
        d = new ResourceUiText(R.string.common_payment_providers__tigo_paybill_content__TZ, ay0.S(new Object[]{resourceUiText}));
        e = new ResourceUiText(R.string.common_payment_providers__vodacom_paybill_content__TZ, ay0.S(new Object[]{resourceUiText2}));
        f = new ResourceUiText(R.string.common_payment_providers__airtel_paybill_content__TZ, ay0.S(new Object[]{resourceUiText3}));
        g = new ResourceUiText(R.string.common_payment_providers__tigo_android_cta_link__TZ);
        h = new ResourceUiText(R.string.common_payment_providers__vodacom_android_cta_link__TZ);
        i = new ResourceUiText(R.string.common_payment_providers__airtel_android_cta_link__TZ);
    }
}
