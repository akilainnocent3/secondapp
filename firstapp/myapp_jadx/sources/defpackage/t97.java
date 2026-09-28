package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.models.ToastCommonModel;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.chat.views.ChatActivity$showCashoutNotification$2", f = "ChatActivity.kt", l = {1410, 1412, 1448, 1450, 1587, 1589}, m = "invokeSuspend", v = 1)
public final class t97 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public boolean A;
    public boolean B;
    public int C;
    public double D;
    public double E;
    public double F;
    public int G;
    public final /* synthetic */ ChatActivity H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public final /* synthetic */ String T;
    public final /* synthetic */ String U;
    public final /* synthetic */ String V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ String X;
    public Object a;
    public ChatActivity b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String i;
    public String v;
    public String w;
    public String y;
    public String z;

    @c0d(c = "com.sportygames.commons.chat.views.ChatActivity$showCashoutNotification$2$1$3", f = "ChatActivity.kt", l = {1480, 1489, 1498}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public AppCompatImageView a;
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ChatActivity d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ChatActivity chatActivity, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = chatActivity;
            this.e = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                String str = this.c;
                boolean zG = Intrinsics.g(str, "RED");
                ChatActivity chatActivity = this.d;
                Context context = this.e;
                if (zG) {
                    ha7 ha7Var = (ha7) chatActivity.a;
                    if (ha7Var != null) {
                        AppCompatImageView appCompatImageView4 = ha7Var.c.D;
                        s4u<String, Bitmap> s4uVar = r9n.a;
                        this.a = appCompatImageView4;
                        this.b = 1;
                        Object objC = r9n.c(this, context, "red_rocket_with_fire_png");
                        if (objC != y5bVar) {
                            obj = objC;
                            appCompatImageView3 = appCompatImageView4;
                            appCompatImageView3.setImageBitmap((Bitmap) obj);
                        }
                        return y5bVar;
                    }
                } else if (Intrinsics.g(str, "PURPLE")) {
                    ha7 ha7Var2 = (ha7) chatActivity.a;
                    if (ha7Var2 != null) {
                        AppCompatImageView appCompatImageView5 = ha7Var2.c.D;
                        s4u<String, Bitmap> s4uVar2 = r9n.a;
                        this.a = appCompatImageView5;
                        this.b = 2;
                        Object objC2 = r9n.c(this, context, "purple_rocket_with_fire_png");
                        if (objC2 != y5bVar) {
                            obj = objC2;
                            appCompatImageView2 = appCompatImageView5;
                            appCompatImageView2.setImageBitmap((Bitmap) obj);
                        }
                        return y5bVar;
                    }
                } else {
                    ha7 ha7Var3 = (ha7) chatActivity.a;
                    if (ha7Var3 != null) {
                        AppCompatImageView appCompatImageView6 = ha7Var3.c.D;
                        s4u<String, Bitmap> s4uVar3 = r9n.a;
                        this.a = appCompatImageView6;
                        this.b = 3;
                        Object objC3 = r9n.c(this, context, "blue_rocket_with_fire_png");
                        if (objC3 != y5bVar) {
                            obj = objC3;
                            appCompatImageView = appCompatImageView6;
                            appCompatImageView.setImageBitmap((Bitmap) obj);
                        }
                        return y5bVar;
                    }
                }
            } else if (i == 1) {
                appCompatImageView3 = this.a;
                uj50.b(obj);
                appCompatImageView3.setImageBitmap((Bitmap) obj);
            } else if (i == 2) {
                appCompatImageView2 = this.a;
                uj50.b(obj);
                appCompatImageView2.setImageBitmap((Bitmap) obj);
            } else {
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                appCompatImageView = this.a;
                uj50.b(obj);
                appCompatImageView.setImageBitmap((Bitmap) obj);
            }
            return Unit.a;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ChatActivity a;

        public b(ChatActivity chatActivity) {
            this.a = chatActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            ChatActivity chatActivity = this.a;
            ha7 ha7Var = (ha7) chatActivity.a;
            if (ha7Var == null || ha7Var.c.y.getLineCount() != 1) {
                ha7 ha7Var2 = (ha7) chatActivity.a;
                if (ha7Var2 != null) {
                    ha7Var2.c.A.setVisibility(8);
                }
                ha7 ha7Var3 = (ha7) chatActivity.a;
                if (ha7Var3 != null) {
                    ha7Var3.c.B.setVisibility(0);
                }
            } else {
                ha7 ha7Var4 = (ha7) chatActivity.a;
                if (ha7Var4 != null) {
                    ha7Var4.c.A.setVisibility(0);
                }
                ha7 ha7Var5 = (ha7) chatActivity.a;
                if (ha7Var5 != null) {
                    ha7Var5.c.B.setVisibility(8);
                }
            }
            ha7 ha7Var6 = (ha7) chatActivity.a;
            if (ha7Var6 == null || (viewTreeObserver = ha7Var6.c.z.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t97(ChatActivity chatActivity, Context context, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z2, String str13, v1b<? super t97> v1bVar) {
        super(2, v1bVar);
        this.H = chatActivity;
        this.I = context;
        this.J = str;
        this.K = str2;
        this.L = str3;
        this.M = str4;
        this.N = str5;
        this.O = z;
        this.P = str6;
        this.Q = str7;
        this.R = str8;
        this.S = str9;
        this.T = str10;
        this.U = str11;
        this.V = str12;
        this.W = z2;
        this.X = str13;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t97(this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t97) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:148:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x050f  */
    /* JADX WARN: Code duplicated, block: B:165:0x051b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0523  */
    /* JADX WARN: Code duplicated, block: B:171:0x0532  */
    /* JADX WARN: Code duplicated, block: B:174:0x0541  */
    /* JADX WARN: Code duplicated, block: B:177:0x0557  */
    /* JADX WARN: Code duplicated, block: B:180:0x056f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0574  */
    /* JADX WARN: Code duplicated, block: B:183:0x0577  */
    /* JADX WARN: Code duplicated, block: B:184:0x057c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0590  */
    /* JADX WARN: Code duplicated, block: B:190:0x059f  */
    /* JADX WARN: Code duplicated, block: B:193:0x05af  */
    /* JADX WARN: Code duplicated, block: B:196:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:202:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:205:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:207:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:209:0x060c  */
    /* JADX WARN: Code duplicated, block: B:210:0x060f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0676  */
    /* JADX WARN: Code duplicated, block: B:214:0x0679  */
    /* JADX WARN: Code duplicated, block: B:218:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:220:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:222:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:223:0x070d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0715  */
    /* JADX WARN: Code duplicated, block: B:227:0x0725  */
    /* JADX WARN: Code duplicated, block: B:230:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:231:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:235:0x0852  */
    /* JADX WARN: Code duplicated, block: B:237:0x0872  */
    /* JADX WARN: Code duplicated, block: B:241:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:244:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:353:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:354:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:357:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:360:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:364:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:370:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:378:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ChatActivity chatActivity;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Object obj2;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z2;
        String str12;
        boolean z3;
        Object obj3;
        Object obj4;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z4;
        boolean z5;
        String str18;
        int i2;
        String str19;
        String str20;
        String str21;
        ChatActivity chatActivity2;
        int iHashCode;
        String str22;
        ha7 ha7Var;
        double d;
        double d2;
        double d3;
        boolean z6;
        boolean z7;
        y5b y5bVar;
        y5b y5bVar2;
        String str23;
        ChatActivity chatActivity3;
        double d4;
        double d5;
        int i3;
        String str24;
        String str25;
        String str26;
        double d6;
        ha7 ha7Var2;
        String str27;
        String str28;
        boolean z8;
        String str29;
        y5b y5bVar3;
        String str30;
        String str31;
        String str32;
        String str33;
        y5b y5bVar4;
        int i4;
        String str34;
        boolean z9;
        ha7 ha7Var3;
        ha7 ha7Var4;
        int i5;
        ha7 ha7Var5;
        ha7 ha7Var6;
        ha7 ha7Var7;
        ha7 ha7Var8;
        ha7 ha7Var9;
        TextView textView;
        TextView textView2;
        ha7 ha7Var10;
        ha7 ha7Var11;
        ha7 ha7Var12;
        ha7 ha7Var13;
        int i6;
        ha7 ha7Var14;
        int i7;
        String strA;
        int i8;
        ha7 ha7Var15;
        int i9;
        boolean z10;
        ChatActivity chatActivity4;
        boolean z11;
        String str35;
        boolean z12;
        boolean z13;
        String str36;
        int i10;
        ChatActivity chatActivity5;
        String str37;
        String str38;
        String str39;
        String str40;
        boolean z14;
        String str41;
        boolean z15;
        String str42;
        Double dH;
        String str43;
        ha7 ha7Var16;
        int i11;
        ha7 ha7Var17;
        ha7 ha7Var18;
        ViewTreeObserver viewTreeObserver;
        int i12;
        int i13;
        ha7 ha7Var19;
        y5b y5bVar5 = y5b.a;
        String str44 = "PR_BET_RECORD";
        String str45 = "CRASH_BET_RECORD";
        switch (this.G) {
            case 0:
                uj50.b(obj);
                chatActivity = this.H;
                if (chatActivity.h0) {
                    Intent intent = new Intent("playCashout");
                    ha7 ha7Var20 = (ha7) chatActivity.a;
                    if (ha7Var20 != null) {
                        i = 8;
                        ha7Var20.c.I.setVisibility(8);
                        Unit unit = Unit.a;
                    } else {
                        i = 8;
                    }
                    ha7 ha7Var21 = (ha7) chatActivity.a;
                    if (ha7Var21 != null) {
                        ha7Var21.c.D.setVisibility(i);
                        Unit unit2 = Unit.a;
                    }
                    ha7 ha7Var22 = (ha7) chatActivity.a;
                    if (ha7Var22 != null) {
                        ha7Var22.c.v.setVisibility(i);
                        Unit unit3 = Unit.a;
                    }
                    fdt.a(chatActivity).c(intent);
                    Context context = this.I;
                    if (context != null) {
                        str = this.J;
                        boolean zG = Intrinsics.g(str, "BET_RECORD");
                        str2 = this.K;
                        if (zG && (ha7Var15 = (ha7) chatActivity.a) != null) {
                            TextView textView3 = ha7Var15.c.i;
                            Map<Double, Integer> map = m18.a;
                            textView3.setBackgroundTintList(o0b.b(context, m18.a(Double.parseDouble(str2))));
                            Unit unit4 = Unit.a;
                        }
                        str3 = this.L;
                        if (str != null) {
                            int iHashCode2 = str.hashCode();
                            str4 = "ONE_PUNCH_RECORD";
                            y5bVar5 = y5bVar5;
                            if (iHashCode2 == -2028485679) {
                                obj2 = "BET_RECORD";
                                if (str.equals("OVER_UNDER_BET_RECORD")) {
                                    ha7 ha7Var23 = (ha7) chatActivity.a;
                                    if (ha7Var23 != null) {
                                        i7 = 0;
                                        ha7Var23.c.d.setVisibility(0);
                                        Unit unit5 = Unit.a;
                                    } else {
                                        i7 = 0;
                                    }
                                    ha7 ha7Var24 = (ha7) chatActivity.a;
                                    if (ha7Var24 != null) {
                                        ha7Var24.c.c.setVisibility(i7);
                                        Unit unit6 = Unit.a;
                                    }
                                    ha7 ha7Var25 = (ha7) chatActivity.a;
                                    if (ha7Var25 != null) {
                                        ha7Var25.c.i.setVisibility(8);
                                        Unit unit7 = Unit.a;
                                    }
                                    ha7 ha7Var26 = (ha7) chatActivity.a;
                                    if (ha7Var26 != null) {
                                        hu1.b(" ", str3, " ", ha7Var26.c.w);
                                        Unit unit8 = Unit.a;
                                    }
                                    ha7 ha7Var27 = (ha7) chatActivity.a;
                                    if (ha7Var27 != null) {
                                        ha7Var27.c.C.setTag(chatActivity.getString(R.string.you_won_text_cms));
                                        Unit unit9 = Unit.a;
                                    }
                                    ha7 ha7Var28 = (ha7) chatActivity.a;
                                    if (ha7Var28 != null) {
                                        ha7Var28.c.b.setTag(chatActivity.getString(R.string.for_cms));
                                        Unit unit10 = Unit.a;
                                    }
                                    ha7 ha7Var29 = (ha7) chatActivity.a;
                                    if (ha7Var29 != null) {
                                        TextView textView4 = ha7Var29.c.d;
                                        if (Intrinsics.g(this.M, "OVER")) {
                                            op5 op5Var = op5.a;
                                            String string = chatActivity.getString(R.string.over_text_cms);
                                            string.getClass();
                                            String string2 = chatActivity.getString(R.string.over_text);
                                            string2.getClass();
                                            op5Var.getClass();
                                            strA = tug.a(" ", op5.b(string, string2, null), " ");
                                        } else {
                                            op5 op5Var2 = op5.a;
                                            String string3 = chatActivity.getString(R.string.under_text_cms);
                                            string3.getClass();
                                            String string4 = chatActivity.getString(R.string.under_text);
                                            string4.getClass();
                                            op5Var2.getClass();
                                            strA = tug.a(" ", op5.b(string3, string4, null), " ");
                                        }
                                        textView4.setText(strA);
                                        Unit unit11 = Unit.a;
                                    }
                                    ha7 ha7Var30 = (ha7) chatActivity.a;
                                    if (ha7Var30 != null) {
                                        TextView textView5 = ha7Var30.c.c;
                                        TreeMap treeMap = pw.a;
                                        hu1.b(" ", pw.n(Double.parseDouble(str2)), "x", textView5);
                                        Unit unit12 = Unit.a;
                                    }
                                    op5 op5Var3 = op5.a;
                                    ha7 ha7Var31 = (ha7) chatActivity.a;
                                    op5.r(op5Var3, kotlin.collections.b.f(ha7Var31 != null ? ha7Var31.c.C : null, ha7Var31 != null ? ha7Var31.c.b : null), null, 6);
                                }
                            } else if (iHashCode2 == -1784259519) {
                                obj2 = "BET_RECORD";
                                if (str.equals("RANGE_BET_RECORD")) {
                                    ha7 ha7Var32 = (ha7) chatActivity.a;
                                    if (ha7Var32 != null) {
                                        ha7Var32.c.d.setVisibility(8);
                                        Unit unit13 = Unit.a;
                                    }
                                    ha7 ha7Var33 = (ha7) chatActivity.a;
                                    if (ha7Var33 != null) {
                                        ha7Var33.c.c.setVisibility(0);
                                        Unit unit14 = Unit.a;
                                    }
                                    ha7 ha7Var34 = (ha7) chatActivity.a;
                                    if (ha7Var34 != null) {
                                        ha7Var34.c.i.setVisibility(8);
                                        Unit unit15 = Unit.a;
                                    }
                                    ha7 ha7Var35 = (ha7) chatActivity.a;
                                    if (ha7Var35 != null) {
                                        hu1.b(" ", str3, " ", ha7Var35.c.w);
                                        Unit unit16 = Unit.a;
                                    }
                                    ha7 ha7Var36 = (ha7) chatActivity.a;
                                    if (ha7Var36 != null) {
                                        TextView textView6 = ha7Var36.c.c;
                                        TreeMap treeMap2 = pw.a;
                                        textView6.setText(tx5.a(" ", pw.n(Double.parseDouble(str2)), "x to ", pw.n(Double.parseDouble(this.N)), "x"));
                                        Unit unit17 = Unit.a;
                                    }
                                    ha7 ha7Var37 = (ha7) chatActivity.a;
                                    if (ha7Var37 != null) {
                                        ha7Var37.c.C.setTag(chatActivity.getString(R.string.you_won_text_cms));
                                        Unit unit18 = Unit.a;
                                    }
                                    ha7 ha7Var38 = (ha7) chatActivity.a;
                                    if (ha7Var38 != null) {
                                        ha7Var38.c.b.setTag(chatActivity.getString(R.string.for_range_cms));
                                        Unit unit19 = Unit.a;
                                    }
                                    op5 op5Var4 = op5.a;
                                    ha7 ha7Var39 = (ha7) chatActivity.a;
                                    op5.r(op5Var4, kotlin.collections.b.f(ha7Var39 != null ? ha7Var39.c.C : null, ha7Var39 != null ? ha7Var39.c.b : null), null, 6);
                                }
                            } else if (iHashCode2 == 948775903 && str.equals("BET_RECORD")) {
                                ha7 ha7Var40 = (ha7) chatActivity.a;
                                if (ha7Var40 != null) {
                                    i8 = 8;
                                    ha7Var40.c.d.setVisibility(8);
                                    Unit unit20 = Unit.a;
                                } else {
                                    i8 = 8;
                                }
                                ha7 ha7Var41 = (ha7) chatActivity.a;
                                if (ha7Var41 != null) {
                                    ha7Var41.c.c.setVisibility(i8);
                                    Unit unit21 = Unit.a;
                                }
                                ha7 ha7Var42 = (ha7) chatActivity.a;
                                if (ha7Var42 != null) {
                                    ha7Var42.c.i.setVisibility(0);
                                    Unit unit22 = Unit.a;
                                }
                                ha7 ha7Var43 = (ha7) chatActivity.a;
                                if (ha7Var43 != null) {
                                    hu1.b(" ", str3, " ", ha7Var43.c.w);
                                    Unit unit23 = Unit.a;
                                }
                                ha7 ha7Var44 = (ha7) chatActivity.a;
                                if (ha7Var44 != null) {
                                    r97.a(ha7Var44.c.i, str2, "x");
                                    Unit unit24 = Unit.a;
                                }
                                ha7 ha7Var45 = (ha7) chatActivity.a;
                                if (ha7Var45 != null) {
                                    ha7Var45.c.C.setTag(chatActivity.getString(R.string.you_cash_out_cms));
                                    Unit unit25 = Unit.a;
                                }
                                ha7 ha7Var46 = (ha7) chatActivity.a;
                                if (ha7Var46 != null) {
                                    ha7Var46.c.b.setTag(chatActivity.getString(R.string.at_cms));
                                    Unit unit26 = Unit.a;
                                }
                                op5 op5Var5 = op5.a;
                                ha7 ha7Var47 = (ha7) chatActivity.a;
                                obj2 = "BET_RECORD";
                                op5.r(op5Var5, kotlin.collections.b.f(ha7Var47 != null ? ha7Var47.c.C : null, ha7Var47 != null ? ha7Var47.c.b : null), null, 6);
                            }
                            z = this.O;
                            str5 = this.P;
                            str6 = this.Q;
                            str7 = this.R;
                            str8 = this.S;
                            str9 = this.T;
                            str10 = this.U;
                            str11 = this.V;
                            z2 = this.W;
                            if (str != null) {
                                iHashCode = str.hashCode();
                                obj3 = "OVER_UNDER_BET_RECORD";
                                obj4 = "RANGE_BET_RECORD";
                                if (iHashCode != -593550853) {
                                    if (iHashCode != 581069719) {
                                        if (iHashCode == 2034532924 && str.equals("PR_BET_RECORD")) {
                                            ha7Var3 = (ha7) chatActivity.a;
                                            if (ha7Var3 != null) {
                                                ha7Var3.c.e.setBackgroundTintList(o0b.b(context, R.color.pr_toast_background_color));
                                                Unit unit27 = Unit.a;
                                            }
                                            ha7Var4 = (ha7) chatActivity.a;
                                            if (ha7Var4 != null) {
                                                i5 = 8;
                                                ha7Var4.c.d.setVisibility(8);
                                                Unit unit28 = Unit.a;
                                            } else {
                                                i5 = 8;
                                            }
                                            ha7Var5 = (ha7) chatActivity.a;
                                            if (ha7Var5 != null) {
                                                ha7Var5.c.c.setVisibility(i5);
                                                Unit unit29 = Unit.a;
                                            }
                                            ha7Var6 = (ha7) chatActivity.a;
                                            if (ha7Var6 != null) {
                                                hu1.b(" ", str3, " ", ha7Var6.c.w);
                                                Unit unit30 = Unit.a;
                                            }
                                            ha7Var7 = (ha7) chatActivity.a;
                                            if (ha7Var7 != null) {
                                                ha7Var7.c.C.setTag(chatActivity.getString(R.string.you_cash_out_cms));
                                                Unit unit31 = Unit.a;
                                            }
                                            ha7Var8 = (ha7) chatActivity.a;
                                            if (ha7Var8 != null) {
                                                ha7Var8.c.b.setTag(chatActivity.getString(R.string.at_cms));
                                                Unit unit32 = Unit.a;
                                            }
                                            op5 op5Var6 = op5.a;
                                            ha7Var9 = (ha7) chatActivity.a;
                                            if (ha7Var9 != null) {
                                                textView = ha7Var9.c.C;
                                            } else {
                                                textView = null;
                                            }
                                            if (ha7Var9 != null) {
                                                textView2 = ha7Var9.c.b;
                                            } else {
                                                textView2 = null;
                                            }
                                            op5.r(op5Var6, kotlin.collections.b.f(textView, textView2), null, 6);
                                            ha7Var10 = (ha7) chatActivity.a;
                                            if (ha7Var10 != null) {
                                                r97.a(ha7Var10.c.v, str2, "x");
                                                Unit unit33 = Unit.a;
                                            }
                                            ha7Var11 = (ha7) chatActivity.a;
                                            if (ha7Var11 != null) {
                                                ha7Var11.c.v.setVisibility(0);
                                                Unit unit34 = Unit.a;
                                            }
                                            ha7Var12 = (ha7) chatActivity.a;
                                            if (ha7Var12 != null) {
                                                ha7Var12.c.i.setVisibility(8);
                                                Unit unit35 = Unit.a;
                                            }
                                            ha7Var13 = (ha7) chatActivity.a;
                                            if (ha7Var13 != null) {
                                                i6 = 0;
                                                ha7Var13.c.I.setVisibility(0);
                                                Unit unit36 = Unit.a;
                                            } else {
                                                i6 = 0;
                                            }
                                            ha7Var14 = (ha7) chatActivity.a;
                                            if (ha7Var14 != null) {
                                                ha7Var14.c.D.setVisibility(i6);
                                                Unit unit37 = Unit.a;
                                            }
                                            pfd pfdVar = fse.a;
                                            ej5.c(w5b.a(gku.a), null, null, new a(this.X, chatActivity, context, null), 3);
                                        }
                                    } else if (str.equals("CRASH_BET_RECORD")) {
                                        ha7Var2 = (ha7) chatActivity.a;
                                        if (ha7Var2 != null) {
                                            ha7Var2.c.a.setVisibility(8);
                                            Unit unit38 = Unit.a;
                                        }
                                        if (z) {
                                            str27 = str5;
                                        } else {
                                            str27 = str6;
                                        }
                                        goj.a aVar = new goj.a(str2, str7, str3, str8, str27, str9, str10, str11, true, z2, z, 28672);
                                        str28 = str2;
                                        z8 = z;
                                        ((x5a0) chatActivity.E1().w0).setValue(aVar);
                                        ((x5a0) chatActivity.q0).setValue(Boolean.TRUE);
                                        this.a = str;
                                        this.b = chatActivity;
                                        this.c = str28;
                                        this.d = str3;
                                        this.e = str5;
                                        this.f = str6;
                                        this.i = str7;
                                        this.v = str8;
                                        this.w = str9;
                                        this.y = str10;
                                        this.z = str11;
                                        this.A = z8;
                                        this.B = z2;
                                        this.C = 0;
                                        this.G = 1;
                                        str29 = str3;
                                        y5bVar3 = y5bVar5;
                                        if (hkd.b(1000L, this) == y5bVar3) {
                                            return y5bVar3;
                                        }
                                        str30 = str9;
                                        str31 = str10;
                                        str32 = str7;
                                        str33 = str8;
                                        y5bVar4 = y5bVar3;
                                        i4 = 0;
                                        str34 = str11;
                                        z9 = z2;
                                        ((x5a0) chatActivity.q0).setValue(Boolean.FALSE);
                                        this.a = str;
                                        this.b = chatActivity;
                                        this.c = str28;
                                        this.d = str29;
                                        this.e = str5;
                                        this.f = str6;
                                        this.i = str32;
                                        this.v = str33;
                                        this.w = str30;
                                        this.y = str31;
                                        this.z = str34;
                                        this.A = z8;
                                        this.B = z9;
                                        i9 = i4;
                                        this.C = i9;
                                        this.G = 2;
                                        z10 = z8;
                                        chatActivity4 = chatActivity;
                                        z11 = z9;
                                        y5bVar5 = y5bVar4;
                                        if (hkd.b(500L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                        str35 = str;
                                        z12 = z10;
                                        z13 = z11;
                                        str36 = str6;
                                        z5 = z13;
                                        z4 = z12;
                                        str14 = str28;
                                        str16 = str33;
                                        str11 = str34;
                                        str17 = str31;
                                        chatActivity2 = chatActivity4;
                                        str15 = str32;
                                        str6 = str36;
                                        str19 = str29;
                                        str18 = str30;
                                        str20 = str5;
                                        str21 = str35;
                                        i2 = i9;
                                        dH = kotlin.text.b.h(str18);
                                        if ((dH != null || dH.doubleValue() <= 0.0d) && (kotlin.text.b.h(str18) != null || str18.length() <= 0)) {
                                            str43 = str45;
                                            ha7Var16 = (ha7) chatActivity2.a;
                                            if (ha7Var16 != null) {
                                                i11 = 8;
                                                ha7Var16.c.A.setVisibility(8);
                                                Unit unit39 = Unit.a;
                                            } else {
                                                i11 = 8;
                                            }
                                            ha7Var17 = (ha7) chatActivity2.a;
                                            if (ha7Var17 != null) {
                                                ha7Var17.c.B.setVisibility(i11);
                                                Unit unit40 = Unit.a;
                                            }
                                        } else {
                                            ha7 ha7Var48 = (ha7) chatActivity2.a;
                                            if (ha7Var48 != null) {
                                                ha7Var48.c.A.setVisibility(4);
                                                Unit unit41 = Unit.a;
                                            }
                                            if (str21 != null) {
                                                switch (str21.hashCode()) {
                                                    case -2028485679:
                                                        str43 = str45;
                                                        if (str21.equals(obj3)) {
                                                            ha7 ha7Var49 = (ha7) chatActivity2.a;
                                                            if (ha7Var49 != null) {
                                                                i12 = 8;
                                                                ha7Var49.c.J.setVisibility(8);
                                                                Unit unit42 = Unit.a;
                                                            } else {
                                                                i12 = 8;
                                                            }
                                                            ha7 ha7Var50 = (ha7) chatActivity2.a;
                                                            if (ha7Var50 != null) {
                                                                ha7Var50.c.G.setVisibility(i12);
                                                                Unit unit43 = Unit.a;
                                                            }
                                                            ha7 ha7Var51 = (ha7) chatActivity2.a;
                                                            if (ha7Var51 != null) {
                                                                ha7Var51.c.E.setText(str20);
                                                                Unit unit44 = Unit.a;
                                                            }
                                                            ha7 ha7Var52 = (ha7) chatActivity2.a;
                                                            if (ha7Var52 != null) {
                                                                ha7Var52.c.y.setText(str18);
                                                                Unit unit45 = Unit.a;
                                                            }
                                                        }
                                                        break;
                                                    case -1784259519:
                                                        str43 = str45;
                                                        if (str21.equals(obj4)) {
                                                            ha7 ha7Var53 = (ha7) chatActivity2.a;
                                                            if (ha7Var53 != null) {
                                                                i13 = 8;
                                                                ha7Var53.c.J.setVisibility(8);
                                                                Unit unit46 = Unit.a;
                                                            } else {
                                                                i13 = 8;
                                                            }
                                                            ha7 ha7Var54 = (ha7) chatActivity2.a;
                                                            if (ha7Var54 != null) {
                                                                ha7Var54.c.G.setVisibility(i13);
                                                                Unit unit47 = Unit.a;
                                                            }
                                                            ha7 ha7Var55 = (ha7) chatActivity2.a;
                                                            if (ha7Var55 != null) {
                                                                ha7Var55.c.E.setText(str20);
                                                                Unit unit48 = Unit.a;
                                                            }
                                                            ha7 ha7Var56 = (ha7) chatActivity2.a;
                                                            if (ha7Var56 != null) {
                                                                ha7Var56.c.y.setText(str18);
                                                                Unit unit49 = Unit.a;
                                                            }
                                                        }
                                                        break;
                                                    case 581069719:
                                                        str43 = str45;
                                                        if (str21.equals(str43)) {
                                                            ha7 ha7Var57 = (ha7) chatActivity2.a;
                                                            if (ha7Var57 != null) {
                                                                ha7Var57.c.a.setVisibility(8);
                                                                Unit unit50 = Unit.a;
                                                            }
                                                            ytw<goj.a> ytwVar = chatActivity2.E1().w0;
                                                            String str46 = (str11 == null || str11.length() == 0) ? str19 : str11;
                                                            String str47 = z4 ? str20 : str6;
                                                            op5.a.getClass();
                                                            String string5 = chatActivity2.getString(R.string.currency, op5.i(str19), str18);
                                                            string5.getClass();
                                                            ((x5a0) ytwVar).setValue(new goj.a(str14, str15, str46, str16, str47, string5, str17, null, true, z5, z4, 28800));
                                                        }
                                                        break;
                                                    case 948775903:
                                                        if (str21.equals(obj2)) {
                                                            ha7 ha7Var58 = (ha7) chatActivity2.a;
                                                            if (ha7Var58 != null) {
                                                                ha7Var58.c.G.setText(str11);
                                                                Unit unit51 = Unit.a;
                                                            }
                                                            ha7 ha7Var59 = (ha7) chatActivity2.a;
                                                            if (ha7Var59 != null) {
                                                                ha7Var59.c.E.setText(str20);
                                                                Unit unit52 = Unit.a;
                                                            }
                                                            ha7 ha7Var60 = (ha7) chatActivity2.a;
                                                            if (ha7Var60 != null) {
                                                                ha7Var60.c.y.setText(str18);
                                                                Unit unit53 = Unit.a;
                                                            }
                                                            ha7 ha7Var61 = (ha7) chatActivity2.a;
                                                            if (ha7Var61 != null) {
                                                                ha7Var61.c.H.setText(str11);
                                                                Unit unit54 = Unit.a;
                                                            }
                                                            ha7 ha7Var62 = (ha7) chatActivity2.a;
                                                            if (ha7Var62 != null) {
                                                                ha7Var62.c.F.setText(str20);
                                                                Unit unit55 = Unit.a;
                                                            }
                                                            ha7 ha7Var63 = (ha7) chatActivity2.a;
                                                            if (ha7Var63 != null) {
                                                                ha7Var63.c.z.setText(str18);
                                                                Unit unit56 = Unit.a;
                                                            }
                                                        }
                                                        str43 = str45;
                                                        break;
                                                    case 2034532924:
                                                        if (str21.equals(str44)) {
                                                            ha7 ha7Var64 = (ha7) chatActivity2.a;
                                                            if (ha7Var64 != null) {
                                                                ha7Var64.c.G.setText(str11);
                                                                Unit unit57 = Unit.a;
                                                            }
                                                            ha7 ha7Var65 = (ha7) chatActivity2.a;
                                                            if (ha7Var65 != null) {
                                                                ha7Var65.c.E.setText(str20);
                                                                Unit unit58 = Unit.a;
                                                            }
                                                            ha7 ha7Var66 = (ha7) chatActivity2.a;
                                                            if (ha7Var66 != null) {
                                                                ha7Var66.c.y.setText(str18);
                                                                Unit unit59 = Unit.a;
                                                            }
                                                            ha7 ha7Var67 = (ha7) chatActivity2.a;
                                                            if (ha7Var67 != null) {
                                                                ha7Var67.c.H.setText(str11);
                                                                Unit unit60 = Unit.a;
                                                            }
                                                            ha7 ha7Var68 = (ha7) chatActivity2.a;
                                                            if (ha7Var68 != null) {
                                                                ha7Var68.c.F.setText(str20);
                                                                Unit unit61 = Unit.a;
                                                            }
                                                            ha7 ha7Var69 = (ha7) chatActivity2.a;
                                                            if (ha7Var69 != null) {
                                                                ha7Var69.c.z.setText(str18);
                                                                Unit unit62 = Unit.a;
                                                            }
                                                        }
                                                        str43 = str45;
                                                        break;
                                                    default:
                                                        str43 = str45;
                                                        break;
                                                }
                                            } else {
                                                str43 = str45;
                                            }
                                            ha7 ha7Var70 = (ha7) chatActivity2.a;
                                            if (ha7Var70 != null && (viewTreeObserver = ha7Var70.c.z.getViewTreeObserver()) != null) {
                                                viewTreeObserver.addOnGlobalLayoutListener(new b(chatActivity2));
                                                Unit unit63 = Unit.a;
                                            }
                                        }
                                        if (!c.l(str21, str43, false) && !c.l(str21, str4, false)) {
                                            ha7Var18 = (ha7) chatActivity2.a;
                                            if (ha7Var18 != null) {
                                                ha7Var18.c.a.setVisibility(0);
                                                Unit unit64 = Unit.a;
                                            }
                                            this.a = chatActivity2;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.i = null;
                                            this.v = null;
                                            this.w = null;
                                            this.y = null;
                                            this.z = null;
                                            this.C = i2;
                                            this.G = 5;
                                            if (hkd.b(1800L, this) == y5bVar5) {
                                                return y5bVar5;
                                            }
                                            ha7Var19 = (ha7) chatActivity2.a;
                                            if (ha7Var19 != null) {
                                                ha7Var19.c.a.setVisibility(8);
                                                Unit unit65 = Unit.a;
                                            }
                                            this.a = null;
                                            this.b = null;
                                            this.C = i2;
                                            this.G = 6;
                                            if (hkd.b(500L, this) == y5bVar5) {
                                                return y5bVar5;
                                            }
                                        }
                                        Unit unit66 = Unit.a;
                                    }
                                    str12 = str8;
                                    str13 = str7;
                                    z3 = z2;
                                } else {
                                    str44 = "PR_BET_RECORD";
                                    str3 = str3;
                                    str12 = str8;
                                    str2 = str2;
                                    str45 = "CRASH_BET_RECORD";
                                    str13 = str7;
                                    str10 = str10;
                                    str22 = str4;
                                    if (str.equals(str22)) {
                                        str4 = str22;
                                        ha7Var = (ha7) chatActivity.a;
                                        if (ha7Var != null) {
                                            ha7Var.c.a.setVisibility(8);
                                            Unit unit67 = Unit.a;
                                        }
                                        d = Double.parseDouble(str12);
                                        d2 = Double.parseDouble(str9);
                                        d3 = d + d2;
                                        op5 op5Var7 = op5.a;
                                        String string6 = chatActivity.getString(R.string.win_message_you_won_android);
                                        string6.getClass();
                                        op5Var7.getClass();
                                        String strConcat = op5.b(string6, "You won", null).concat(" ");
                                        TreeMap treeMap3 = pw.a;
                                        String strA2 = tug.a(str13, " ", pw.a(krh0.l(d)));
                                        String string7 = chatActivity.getString(R.string.win_message_at_android);
                                        string7.getClass();
                                        ((x5a0) chatActivity.D1().U).setValue(new ToastCommonModel(strConcat, strA2, tug.a(" ", op5.b(string7, "at", null), " "), yk10.a(str2, "x"), context.getColor(R.color.sg_rush_toast_color), tug.a(str13, " ", pw.a(krh0.l(d2))), tug.a(str13, " ", pw.a(krh0.l(d3))), d2));
                                        ((x5a0) chatActivity.r0).setValue(Boolean.TRUE);
                                        this.a = str;
                                        this.b = chatActivity;
                                        this.c = str2;
                                        this.d = str3;
                                        this.e = str5;
                                        this.f = str6;
                                        this.i = str13;
                                        this.v = str12;
                                        this.w = str9;
                                        this.y = str10;
                                        this.z = str11;
                                        z6 = z;
                                        this.A = z6;
                                        z7 = z2;
                                        this.B = z7;
                                        this.C = 0;
                                        this.D = d;
                                        this.E = d2;
                                        this.F = d3;
                                        this.G = 3;
                                        y5bVar = y5bVar5;
                                        if (hkd.b(1000L, this) == y5bVar) {
                                            return y5bVar;
                                        }
                                        y5bVar2 = y5bVar;
                                        str23 = str11;
                                        chatActivity3 = chatActivity;
                                        d4 = d;
                                        d5 = d3;
                                        i3 = 0;
                                        str24 = str13;
                                        str25 = str12;
                                        str26 = str9;
                                        d6 = d2;
                                        i10 = i3;
                                        ((x5a0) chatActivity3.r0).setValue(Boolean.FALSE);
                                        this.a = str;
                                        this.b = chatActivity3;
                                        this.c = str2;
                                        this.d = str3;
                                        this.e = str5;
                                        this.f = str6;
                                        this.i = str24;
                                        this.v = str25;
                                        this.w = str26;
                                        this.y = str10;
                                        this.z = str23;
                                        this.A = z6;
                                        this.B = z7;
                                        this.C = i10;
                                        chatActivity5 = chatActivity3;
                                        str37 = str23;
                                        this.D = d4;
                                        this.E = d6;
                                        this.F = d5;
                                        this.G = 4;
                                        y5bVar5 = y5bVar2;
                                        if (hkd.b(500L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                        str38 = str;
                                        str39 = str6;
                                        str40 = str10;
                                        z14 = z7;
                                        str41 = str25;
                                        str18 = str26;
                                        z15 = z6;
                                        str42 = str24;
                                        str17 = str40;
                                        z5 = z14;
                                        str14 = str2;
                                        z4 = z15;
                                        chatActivity2 = chatActivity5;
                                        str16 = str41;
                                        str15 = str42;
                                        str6 = str39;
                                        str11 = str37;
                                        str19 = str3;
                                        str20 = str5;
                                        str21 = str38;
                                        i2 = i10;
                                        dH = kotlin.text.b.h(str18);
                                        if (dH != null) {
                                            str43 = str45;
                                            ha7Var16 = (ha7) chatActivity2.a;
                                            if (ha7Var16 != null) {
                                                i11 = 8;
                                                ha7Var16.c.A.setVisibility(8);
                                                Unit unit310 = Unit.a;
                                            } else {
                                                i11 = 8;
                                            }
                                            ha7Var17 = (ha7) chatActivity2.a;
                                            if (ha7Var17 != null) {
                                                ha7Var17.c.B.setVisibility(i11);
                                                Unit unit410 = Unit.a;
                                            }
                                        } else {
                                            str43 = str45;
                                            ha7Var16 = (ha7) chatActivity2.a;
                                            if (ha7Var16 != null) {
                                                i11 = 8;
                                                ha7Var16.c.A.setVisibility(8);
                                                Unit unit311 = Unit.a;
                                            } else {
                                                i11 = 8;
                                            }
                                            ha7Var17 = (ha7) chatActivity2.a;
                                            if (ha7Var17 != null) {
                                                ha7Var17.c.B.setVisibility(i11);
                                                Unit unit411 = Unit.a;
                                            }
                                        }
                                        if (!c.l(str21, str43, false)) {
                                            ha7Var18 = (ha7) chatActivity2.a;
                                            if (ha7Var18 != null) {
                                                ha7Var18.c.a.setVisibility(0);
                                                Unit unit68 = Unit.a;
                                            }
                                            this.a = chatActivity2;
                                            this.b = null;
                                            this.c = null;
                                            this.d = null;
                                            this.e = null;
                                            this.f = null;
                                            this.i = null;
                                            this.v = null;
                                            this.w = null;
                                            this.y = null;
                                            this.z = null;
                                            this.C = i2;
                                            this.G = 5;
                                            if (hkd.b(1800L, this) == y5bVar5) {
                                                return y5bVar5;
                                            }
                                            ha7Var19 = (ha7) chatActivity2.a;
                                            if (ha7Var19 != null) {
                                                ha7Var19.c.a.setVisibility(8);
                                                Unit unit69 = Unit.a;
                                            }
                                            this.a = null;
                                            this.b = null;
                                            this.C = i2;
                                            this.G = 6;
                                            if (hkd.b(500L, this) == y5bVar5) {
                                                return y5bVar5;
                                            }
                                        }
                                        Unit unit610 = Unit.a;
                                    } else {
                                        str11 = str11;
                                        chatActivity = chatActivity;
                                        str9 = str9;
                                        str4 = str22;
                                        z3 = z2;
                                    }
                                }
                                str14 = str2;
                                str15 = str13;
                                str16 = str12;
                                str17 = str10;
                                z4 = z;
                                z5 = z3;
                                str18 = str9;
                                i2 = 0;
                                str19 = str3;
                                str20 = str5;
                                str21 = str;
                                chatActivity2 = chatActivity;
                                dH = kotlin.text.b.h(str18);
                                if (dH != null) {
                                    str43 = str45;
                                    ha7Var16 = (ha7) chatActivity2.a;
                                    if (ha7Var16 != null) {
                                        i11 = 8;
                                        ha7Var16.c.A.setVisibility(8);
                                        Unit unit312 = Unit.a;
                                    } else {
                                        i11 = 8;
                                    }
                                    ha7Var17 = (ha7) chatActivity2.a;
                                    if (ha7Var17 != null) {
                                        ha7Var17.c.B.setVisibility(i11);
                                        Unit unit412 = Unit.a;
                                    }
                                } else {
                                    str43 = str45;
                                    ha7Var16 = (ha7) chatActivity2.a;
                                    if (ha7Var16 != null) {
                                        i11 = 8;
                                        ha7Var16.c.A.setVisibility(8);
                                        Unit unit313 = Unit.a;
                                    } else {
                                        i11 = 8;
                                    }
                                    ha7Var17 = (ha7) chatActivity2.a;
                                    if (ha7Var17 != null) {
                                        ha7Var17.c.B.setVisibility(i11);
                                        Unit unit413 = Unit.a;
                                    }
                                }
                                if (!c.l(str21, str43, false)) {
                                    ha7Var18 = (ha7) chatActivity2.a;
                                    if (ha7Var18 != null) {
                                        ha7Var18.c.a.setVisibility(0);
                                        Unit unit611 = Unit.a;
                                    }
                                    this.a = chatActivity2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = null;
                                    this.i = null;
                                    this.v = null;
                                    this.w = null;
                                    this.y = null;
                                    this.z = null;
                                    this.C = i2;
                                    this.G = 5;
                                    if (hkd.b(1800L, this) == y5bVar5) {
                                        return y5bVar5;
                                    }
                                    ha7Var19 = (ha7) chatActivity2.a;
                                    if (ha7Var19 != null) {
                                        ha7Var19.c.a.setVisibility(8);
                                        Unit unit612 = Unit.a;
                                    }
                                    this.a = null;
                                    this.b = null;
                                    this.C = i2;
                                    this.G = 6;
                                    if (hkd.b(500L, this) == y5bVar5) {
                                        return y5bVar5;
                                    }
                                }
                                Unit unit613 = Unit.a;
                            } else {
                                str12 = str8;
                                z3 = z2;
                                obj3 = "OVER_UNDER_BET_RECORD";
                                obj4 = "RANGE_BET_RECORD";
                                str13 = str7;
                            }
                            str14 = str2;
                            str15 = str13;
                            str16 = str12;
                            str17 = str10;
                            z4 = z;
                            z5 = z3;
                            str18 = str9;
                            i2 = 0;
                            str19 = str3;
                            str20 = str5;
                            str21 = str;
                            chatActivity2 = chatActivity;
                            dH = kotlin.text.b.h(str18);
                            if (dH != null) {
                                str43 = str45;
                                ha7Var16 = (ha7) chatActivity2.a;
                                if (ha7Var16 != null) {
                                    i11 = 8;
                                    ha7Var16.c.A.setVisibility(8);
                                    Unit unit314 = Unit.a;
                                } else {
                                    i11 = 8;
                                }
                                ha7Var17 = (ha7) chatActivity2.a;
                                if (ha7Var17 != null) {
                                    ha7Var17.c.B.setVisibility(i11);
                                    Unit unit414 = Unit.a;
                                }
                            } else {
                                str43 = str45;
                                ha7Var16 = (ha7) chatActivity2.a;
                                if (ha7Var16 != null) {
                                    i11 = 8;
                                    ha7Var16.c.A.setVisibility(8);
                                    Unit unit315 = Unit.a;
                                } else {
                                    i11 = 8;
                                }
                                ha7Var17 = (ha7) chatActivity2.a;
                                if (ha7Var17 != null) {
                                    ha7Var17.c.B.setVisibility(i11);
                                    Unit unit415 = Unit.a;
                                }
                            }
                            if (!c.l(str21, str43, false)) {
                                ha7Var18 = (ha7) chatActivity2.a;
                                if (ha7Var18 != null) {
                                    ha7Var18.c.a.setVisibility(0);
                                    Unit unit614 = Unit.a;
                                }
                                this.a = chatActivity2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.i = null;
                                this.v = null;
                                this.w = null;
                                this.y = null;
                                this.z = null;
                                this.C = i2;
                                this.G = 5;
                                if (hkd.b(1800L, this) == y5bVar5) {
                                    return y5bVar5;
                                }
                                ha7Var19 = (ha7) chatActivity2.a;
                                if (ha7Var19 != null) {
                                    ha7Var19.c.a.setVisibility(8);
                                    Unit unit615 = Unit.a;
                                }
                                this.a = null;
                                this.b = null;
                                this.C = i2;
                                this.G = 6;
                                if (hkd.b(500L, this) == y5bVar5) {
                                    return y5bVar5;
                                }
                            }
                            Unit unit616 = Unit.a;
                        } else {
                            y5bVar5 = y5bVar5;
                            str4 = "ONE_PUNCH_RECORD";
                        }
                        obj2 = "BET_RECORD";
                        z = this.O;
                        str5 = this.P;
                        str6 = this.Q;
                        str7 = this.R;
                        str8 = this.S;
                        str9 = this.T;
                        str10 = this.U;
                        str11 = this.V;
                        z2 = this.W;
                        if (str != null) {
                            iHashCode = str.hashCode();
                            obj3 = "OVER_UNDER_BET_RECORD";
                            obj4 = "RANGE_BET_RECORD";
                            if (iHashCode != -593550853) {
                                if (iHashCode != 581069719) {
                                    if (iHashCode == 2034532924) {
                                        ha7Var3 = (ha7) chatActivity.a;
                                        if (ha7Var3 != null) {
                                            ha7Var3.c.e.setBackgroundTintList(o0b.b(context, R.color.pr_toast_background_color));
                                            Unit unit210 = Unit.a;
                                        }
                                        ha7Var4 = (ha7) chatActivity.a;
                                        if (ha7Var4 != null) {
                                            i5 = 8;
                                            ha7Var4.c.d.setVisibility(8);
                                            Unit unit211 = Unit.a;
                                        } else {
                                            i5 = 8;
                                        }
                                        ha7Var5 = (ha7) chatActivity.a;
                                        if (ha7Var5 != null) {
                                            ha7Var5.c.c.setVisibility(i5);
                                            Unit unit212 = Unit.a;
                                        }
                                        ha7Var6 = (ha7) chatActivity.a;
                                        if (ha7Var6 != null) {
                                            hu1.b(" ", str3, " ", ha7Var6.c.w);
                                            Unit unit316 = Unit.a;
                                        }
                                        ha7Var7 = (ha7) chatActivity.a;
                                        if (ha7Var7 != null) {
                                            ha7Var7.c.C.setTag(chatActivity.getString(R.string.you_cash_out_cms));
                                            Unit unit317 = Unit.a;
                                        }
                                        ha7Var8 = (ha7) chatActivity.a;
                                        if (ha7Var8 != null) {
                                            ha7Var8.c.b.setTag(chatActivity.getString(R.string.at_cms));
                                            Unit unit318 = Unit.a;
                                        }
                                        op5 op5Var8 = op5.a;
                                        ha7Var9 = (ha7) chatActivity.a;
                                        if (ha7Var9 != null) {
                                            textView = ha7Var9.c.C;
                                        } else {
                                            textView = null;
                                        }
                                        if (ha7Var9 != null) {
                                            textView2 = ha7Var9.c.b;
                                        } else {
                                            textView2 = null;
                                        }
                                        op5.r(op5Var8, kotlin.collections.b.f(textView, textView2), null, 6);
                                        ha7Var10 = (ha7) chatActivity.a;
                                        if (ha7Var10 != null) {
                                            r97.a(ha7Var10.c.v, str2, "x");
                                            Unit unit319 = Unit.a;
                                        }
                                        ha7Var11 = (ha7) chatActivity.a;
                                        if (ha7Var11 != null) {
                                            ha7Var11.c.v.setVisibility(0);
                                            Unit unit320 = Unit.a;
                                        }
                                        ha7Var12 = (ha7) chatActivity.a;
                                        if (ha7Var12 != null) {
                                            ha7Var12.c.i.setVisibility(8);
                                            Unit unit321 = Unit.a;
                                        }
                                        ha7Var13 = (ha7) chatActivity.a;
                                        if (ha7Var13 != null) {
                                            i6 = 0;
                                            ha7Var13.c.I.setVisibility(0);
                                            Unit unit322 = Unit.a;
                                        } else {
                                            i6 = 0;
                                        }
                                        ha7Var14 = (ha7) chatActivity.a;
                                        if (ha7Var14 != null) {
                                            ha7Var14.c.D.setVisibility(i6);
                                            Unit unit323 = Unit.a;
                                        }
                                        pfd pfdVar2 = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new a(this.X, chatActivity, context, null), 3);
                                    }
                                } else if (str.equals("CRASH_BET_RECORD")) {
                                    ha7Var2 = (ha7) chatActivity.a;
                                    if (ha7Var2 != null) {
                                        ha7Var2.c.a.setVisibility(8);
                                        Unit unit324 = Unit.a;
                                    }
                                    if (z) {
                                        str27 = str5;
                                    } else {
                                        str27 = str6;
                                    }
                                    goj.a aVar2 = new goj.a(str2, str7, str3, str8, str27, str9, str10, str11, true, z2, z, 28672);
                                    str28 = str2;
                                    z8 = z;
                                    ((x5a0) chatActivity.E1().w0).setValue(aVar2);
                                    ((x5a0) chatActivity.q0).setValue(Boolean.TRUE);
                                    this.a = str;
                                    this.b = chatActivity;
                                    this.c = str28;
                                    this.d = str3;
                                    this.e = str5;
                                    this.f = str6;
                                    this.i = str7;
                                    this.v = str8;
                                    this.w = str9;
                                    this.y = str10;
                                    this.z = str11;
                                    this.A = z8;
                                    this.B = z2;
                                    this.C = 0;
                                    this.G = 1;
                                    str29 = str3;
                                    y5bVar3 = y5bVar5;
                                    if (hkd.b(1000L, this) == y5bVar3) {
                                        return y5bVar3;
                                    }
                                    str30 = str9;
                                    str31 = str10;
                                    str32 = str7;
                                    str33 = str8;
                                    y5bVar4 = y5bVar3;
                                    i4 = 0;
                                    str34 = str11;
                                    z9 = z2;
                                    ((x5a0) chatActivity.q0).setValue(Boolean.FALSE);
                                    this.a = str;
                                    this.b = chatActivity;
                                    this.c = str28;
                                    this.d = str29;
                                    this.e = str5;
                                    this.f = str6;
                                    this.i = str32;
                                    this.v = str33;
                                    this.w = str30;
                                    this.y = str31;
                                    this.z = str34;
                                    this.A = z8;
                                    this.B = z9;
                                    i9 = i4;
                                    this.C = i9;
                                    this.G = 2;
                                    z10 = z8;
                                    chatActivity4 = chatActivity;
                                    z11 = z9;
                                    y5bVar5 = y5bVar4;
                                    if (hkd.b(500L, this) == y5bVar5) {
                                        return y5bVar5;
                                    }
                                    str35 = str;
                                    z12 = z10;
                                    z13 = z11;
                                    str36 = str6;
                                    z5 = z13;
                                    z4 = z12;
                                    str14 = str28;
                                    str16 = str33;
                                    str11 = str34;
                                    str17 = str31;
                                    chatActivity2 = chatActivity4;
                                    str15 = str32;
                                    str6 = str36;
                                    str19 = str29;
                                    str18 = str30;
                                    str20 = str5;
                                    str21 = str35;
                                    i2 = i9;
                                    dH = kotlin.text.b.h(str18);
                                    if (dH != null) {
                                        str43 = str45;
                                        ha7Var16 = (ha7) chatActivity2.a;
                                        if (ha7Var16 != null) {
                                            i11 = 8;
                                            ha7Var16.c.A.setVisibility(8);
                                            Unit unit3110 = Unit.a;
                                        } else {
                                            i11 = 8;
                                        }
                                        ha7Var17 = (ha7) chatActivity2.a;
                                        if (ha7Var17 != null) {
                                            ha7Var17.c.B.setVisibility(i11);
                                            Unit unit416 = Unit.a;
                                        }
                                    } else {
                                        str43 = str45;
                                        ha7Var16 = (ha7) chatActivity2.a;
                                        if (ha7Var16 != null) {
                                            i11 = 8;
                                            ha7Var16.c.A.setVisibility(8);
                                            Unit unit3111 = Unit.a;
                                        } else {
                                            i11 = 8;
                                        }
                                        ha7Var17 = (ha7) chatActivity2.a;
                                        if (ha7Var17 != null) {
                                            ha7Var17.c.B.setVisibility(i11);
                                            Unit unit417 = Unit.a;
                                        }
                                    }
                                    if (!c.l(str21, str43, false)) {
                                        ha7Var18 = (ha7) chatActivity2.a;
                                        if (ha7Var18 != null) {
                                            ha7Var18.c.a.setVisibility(0);
                                            Unit unit617 = Unit.a;
                                        }
                                        this.a = chatActivity2;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.i = null;
                                        this.v = null;
                                        this.w = null;
                                        this.y = null;
                                        this.z = null;
                                        this.C = i2;
                                        this.G = 5;
                                        if (hkd.b(1800L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                        ha7Var19 = (ha7) chatActivity2.a;
                                        if (ha7Var19 != null) {
                                            ha7Var19.c.a.setVisibility(8);
                                            Unit unit618 = Unit.a;
                                        }
                                        this.a = null;
                                        this.b = null;
                                        this.C = i2;
                                        this.G = 6;
                                        if (hkd.b(500L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                    }
                                    Unit unit619 = Unit.a;
                                }
                                str12 = str8;
                                str13 = str7;
                                z3 = z2;
                            } else {
                                str44 = "PR_BET_RECORD";
                                str3 = str3;
                                str12 = str8;
                                str2 = str2;
                                str45 = "CRASH_BET_RECORD";
                                str13 = str7;
                                str10 = str10;
                                str22 = str4;
                                if (str.equals(str22)) {
                                    str11 = str11;
                                    chatActivity = chatActivity;
                                    str9 = str9;
                                    str4 = str22;
                                    z3 = z2;
                                } else {
                                    str4 = str22;
                                    ha7Var = (ha7) chatActivity.a;
                                    if (ha7Var != null) {
                                        ha7Var.c.a.setVisibility(8);
                                        Unit unit620 = Unit.a;
                                    }
                                    d = Double.parseDouble(str12);
                                    d2 = Double.parseDouble(str9);
                                    d3 = d + d2;
                                    op5 op5Var9 = op5.a;
                                    String string8 = chatActivity.getString(R.string.win_message_you_won_android);
                                    string8.getClass();
                                    op5Var9.getClass();
                                    String strConcat2 = op5.b(string8, "You won", null).concat(" ");
                                    TreeMap treeMap4 = pw.a;
                                    String strA3 = tug.a(str13, " ", pw.a(krh0.l(d)));
                                    String string9 = chatActivity.getString(R.string.win_message_at_android);
                                    string9.getClass();
                                    ((x5a0) chatActivity.D1().U).setValue(new ToastCommonModel(strConcat2, strA3, tug.a(" ", op5.b(string9, "at", null), " "), yk10.a(str2, "x"), context.getColor(R.color.sg_rush_toast_color), tug.a(str13, " ", pw.a(krh0.l(d2))), tug.a(str13, " ", pw.a(krh0.l(d3))), d2));
                                    ((x5a0) chatActivity.r0).setValue(Boolean.TRUE);
                                    this.a = str;
                                    this.b = chatActivity;
                                    this.c = str2;
                                    this.d = str3;
                                    this.e = str5;
                                    this.f = str6;
                                    this.i = str13;
                                    this.v = str12;
                                    this.w = str9;
                                    this.y = str10;
                                    this.z = str11;
                                    z6 = z;
                                    this.A = z6;
                                    z7 = z2;
                                    this.B = z7;
                                    this.C = 0;
                                    this.D = d;
                                    this.E = d2;
                                    this.F = d3;
                                    this.G = 3;
                                    y5bVar = y5bVar5;
                                    if (hkd.b(1000L, this) == y5bVar) {
                                        return y5bVar;
                                    }
                                    y5bVar2 = y5bVar;
                                    str23 = str11;
                                    chatActivity3 = chatActivity;
                                    d4 = d;
                                    d5 = d3;
                                    i3 = 0;
                                    str24 = str13;
                                    str25 = str12;
                                    str26 = str9;
                                    d6 = d2;
                                    i10 = i3;
                                    ((x5a0) chatActivity3.r0).setValue(Boolean.FALSE);
                                    this.a = str;
                                    this.b = chatActivity3;
                                    this.c = str2;
                                    this.d = str3;
                                    this.e = str5;
                                    this.f = str6;
                                    this.i = str24;
                                    this.v = str25;
                                    this.w = str26;
                                    this.y = str10;
                                    this.z = str23;
                                    this.A = z6;
                                    this.B = z7;
                                    this.C = i10;
                                    chatActivity5 = chatActivity3;
                                    str37 = str23;
                                    this.D = d4;
                                    this.E = d6;
                                    this.F = d5;
                                    this.G = 4;
                                    y5bVar5 = y5bVar2;
                                    if (hkd.b(500L, this) == y5bVar5) {
                                        return y5bVar5;
                                    }
                                    str38 = str;
                                    str39 = str6;
                                    str40 = str10;
                                    z14 = z7;
                                    str41 = str25;
                                    str18 = str26;
                                    z15 = z6;
                                    str42 = str24;
                                    str17 = str40;
                                    z5 = z14;
                                    str14 = str2;
                                    z4 = z15;
                                    chatActivity2 = chatActivity5;
                                    str16 = str41;
                                    str15 = str42;
                                    str6 = str39;
                                    str11 = str37;
                                    str19 = str3;
                                    str20 = str5;
                                    str21 = str38;
                                    i2 = i10;
                                    dH = kotlin.text.b.h(str18);
                                    if (dH != null) {
                                        str43 = str45;
                                        ha7Var16 = (ha7) chatActivity2.a;
                                        if (ha7Var16 != null) {
                                            i11 = 8;
                                            ha7Var16.c.A.setVisibility(8);
                                            Unit unit3112 = Unit.a;
                                        } else {
                                            i11 = 8;
                                        }
                                        ha7Var17 = (ha7) chatActivity2.a;
                                        if (ha7Var17 != null) {
                                            ha7Var17.c.B.setVisibility(i11);
                                            Unit unit418 = Unit.a;
                                        }
                                    } else {
                                        str43 = str45;
                                        ha7Var16 = (ha7) chatActivity2.a;
                                        if (ha7Var16 != null) {
                                            i11 = 8;
                                            ha7Var16.c.A.setVisibility(8);
                                            Unit unit3113 = Unit.a;
                                        } else {
                                            i11 = 8;
                                        }
                                        ha7Var17 = (ha7) chatActivity2.a;
                                        if (ha7Var17 != null) {
                                            ha7Var17.c.B.setVisibility(i11);
                                            Unit unit419 = Unit.a;
                                        }
                                    }
                                    if (!c.l(str21, str43, false)) {
                                        ha7Var18 = (ha7) chatActivity2.a;
                                        if (ha7Var18 != null) {
                                            ha7Var18.c.a.setVisibility(0);
                                            Unit unit6110 = Unit.a;
                                        }
                                        this.a = chatActivity2;
                                        this.b = null;
                                        this.c = null;
                                        this.d = null;
                                        this.e = null;
                                        this.f = null;
                                        this.i = null;
                                        this.v = null;
                                        this.w = null;
                                        this.y = null;
                                        this.z = null;
                                        this.C = i2;
                                        this.G = 5;
                                        if (hkd.b(1800L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                        ha7Var19 = (ha7) chatActivity2.a;
                                        if (ha7Var19 != null) {
                                            ha7Var19.c.a.setVisibility(8);
                                            Unit unit6111 = Unit.a;
                                        }
                                        this.a = null;
                                        this.b = null;
                                        this.C = i2;
                                        this.G = 6;
                                        if (hkd.b(500L, this) == y5bVar5) {
                                            return y5bVar5;
                                        }
                                    }
                                    Unit unit6112 = Unit.a;
                                }
                            }
                            str14 = str2;
                            str15 = str13;
                            str16 = str12;
                            str17 = str10;
                            z4 = z;
                            z5 = z3;
                            str18 = str9;
                            i2 = 0;
                            str19 = str3;
                            str20 = str5;
                            str21 = str;
                            chatActivity2 = chatActivity;
                            dH = kotlin.text.b.h(str18);
                            if (dH != null) {
                                str43 = str45;
                                ha7Var16 = (ha7) chatActivity2.a;
                                if (ha7Var16 != null) {
                                    i11 = 8;
                                    ha7Var16.c.A.setVisibility(8);
                                    Unit unit3114 = Unit.a;
                                } else {
                                    i11 = 8;
                                }
                                ha7Var17 = (ha7) chatActivity2.a;
                                if (ha7Var17 != null) {
                                    ha7Var17.c.B.setVisibility(i11);
                                    Unit unit4110 = Unit.a;
                                }
                            } else {
                                str43 = str45;
                                ha7Var16 = (ha7) chatActivity2.a;
                                if (ha7Var16 != null) {
                                    i11 = 8;
                                    ha7Var16.c.A.setVisibility(8);
                                    Unit unit3115 = Unit.a;
                                } else {
                                    i11 = 8;
                                }
                                ha7Var17 = (ha7) chatActivity2.a;
                                if (ha7Var17 != null) {
                                    ha7Var17.c.B.setVisibility(i11);
                                    Unit unit4111 = Unit.a;
                                }
                            }
                            if (!c.l(str21, str43, false)) {
                                ha7Var18 = (ha7) chatActivity2.a;
                                if (ha7Var18 != null) {
                                    ha7Var18.c.a.setVisibility(0);
                                    Unit unit6113 = Unit.a;
                                }
                                this.a = chatActivity2;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.f = null;
                                this.i = null;
                                this.v = null;
                                this.w = null;
                                this.y = null;
                                this.z = null;
                                this.C = i2;
                                this.G = 5;
                                if (hkd.b(1800L, this) == y5bVar5) {
                                    return y5bVar5;
                                }
                                ha7Var19 = (ha7) chatActivity2.a;
                                if (ha7Var19 != null) {
                                    ha7Var19.c.a.setVisibility(8);
                                    Unit unit6114 = Unit.a;
                                }
                                this.a = null;
                                this.b = null;
                                this.C = i2;
                                this.G = 6;
                                if (hkd.b(500L, this) == y5bVar5) {
                                    return y5bVar5;
                                }
                            }
                            Unit unit6115 = Unit.a;
                        } else {
                            str12 = str8;
                            z3 = z2;
                            obj3 = "OVER_UNDER_BET_RECORD";
                            obj4 = "RANGE_BET_RECORD";
                            str13 = str7;
                        }
                        str14 = str2;
                        str15 = str13;
                        str16 = str12;
                        str17 = str10;
                        z4 = z;
                        z5 = z3;
                        str18 = str9;
                        i2 = 0;
                        str19 = str3;
                        str20 = str5;
                        str21 = str;
                        chatActivity2 = chatActivity;
                        dH = kotlin.text.b.h(str18);
                        if (dH != null) {
                            str43 = str45;
                            ha7Var16 = (ha7) chatActivity2.a;
                            if (ha7Var16 != null) {
                                i11 = 8;
                                ha7Var16.c.A.setVisibility(8);
                                Unit unit3116 = Unit.a;
                            } else {
                                i11 = 8;
                            }
                            ha7Var17 = (ha7) chatActivity2.a;
                            if (ha7Var17 != null) {
                                ha7Var17.c.B.setVisibility(i11);
                                Unit unit4112 = Unit.a;
                            }
                        } else {
                            str43 = str45;
                            ha7Var16 = (ha7) chatActivity2.a;
                            if (ha7Var16 != null) {
                                i11 = 8;
                                ha7Var16.c.A.setVisibility(8);
                                Unit unit3117 = Unit.a;
                            } else {
                                i11 = 8;
                            }
                            ha7Var17 = (ha7) chatActivity2.a;
                            if (ha7Var17 != null) {
                                ha7Var17.c.B.setVisibility(i11);
                                Unit unit4113 = Unit.a;
                            }
                        }
                        if (!c.l(str21, str43, false)) {
                            ha7Var18 = (ha7) chatActivity2.a;
                            if (ha7Var18 != null) {
                                ha7Var18.c.a.setVisibility(0);
                                Unit unit6116 = Unit.a;
                            }
                            this.a = chatActivity2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.i = null;
                            this.v = null;
                            this.w = null;
                            this.y = null;
                            this.z = null;
                            this.C = i2;
                            this.G = 5;
                            if (hkd.b(1800L, this) == y5bVar5) {
                                return y5bVar5;
                            }
                            ha7Var19 = (ha7) chatActivity2.a;
                            if (ha7Var19 != null) {
                                ha7Var19.c.a.setVisibility(8);
                                Unit unit6117 = Unit.a;
                            }
                            this.a = null;
                            this.b = null;
                            this.C = i2;
                            this.G = 6;
                            if (hkd.b(500L, this) == y5bVar5) {
                                return y5bVar5;
                            }
                        }
                        Unit unit6118 = Unit.a;
                    }
                }
                return Unit.a;
            case 1:
                int i14 = this.C;
                z9 = this.B;
                boolean z16 = this.A;
                str34 = this.z;
                str31 = this.y;
                str30 = this.w;
                String str48 = this.v;
                str32 = this.i;
                String str49 = this.f;
                String str50 = this.e;
                String str51 = this.d;
                String str52 = this.c;
                ChatActivity chatActivity6 = this.b;
                String str53 = (String) this.a;
                uj50.b(obj);
                i4 = i14;
                y5bVar4 = y5bVar5;
                z8 = z16;
                str4 = "ONE_PUNCH_RECORD";
                obj3 = "OVER_UNDER_BET_RECORD";
                obj4 = "RANGE_BET_RECORD";
                obj2 = "BET_RECORD";
                str33 = str48;
                str6 = str49;
                str5 = str50;
                str28 = str52;
                str = str53;
                str29 = str51;
                chatActivity = chatActivity6;
                ((x5a0) chatActivity.q0).setValue(Boolean.FALSE);
                this.a = str;
                this.b = chatActivity;
                this.c = str28;
                this.d = str29;
                this.e = str5;
                this.f = str6;
                this.i = str32;
                this.v = str33;
                this.w = str30;
                this.y = str31;
                this.z = str34;
                this.A = z8;
                this.B = z9;
                i9 = i4;
                this.C = i9;
                this.G = 2;
                z10 = z8;
                chatActivity4 = chatActivity;
                z11 = z9;
                y5bVar5 = y5bVar4;
                if (hkd.b(500L, this) == y5bVar5) {
                    return y5bVar5;
                }
                str35 = str;
                z12 = z10;
                z13 = z11;
                str36 = str6;
                z5 = z13;
                z4 = z12;
                str14 = str28;
                str16 = str33;
                str11 = str34;
                str17 = str31;
                chatActivity2 = chatActivity4;
                str15 = str32;
                str6 = str36;
                str19 = str29;
                str18 = str30;
                str20 = str5;
                str21 = str35;
                i2 = i9;
                dH = kotlin.text.b.h(str18);
                if (dH != null) {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit3118 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4114 = Unit.a;
                    }
                } else {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit3119 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4115 = Unit.a;
                    }
                }
                if (!c.l(str21, str43, false)) {
                    ha7Var18 = (ha7) chatActivity2.a;
                    if (ha7Var18 != null) {
                        ha7Var18.c.a.setVisibility(0);
                        Unit unit6119 = Unit.a;
                    }
                    this.a = chatActivity2;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = null;
                    this.C = i2;
                    this.G = 5;
                    if (hkd.b(1800L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                    ha7Var19 = (ha7) chatActivity2.a;
                    if (ha7Var19 != null) {
                        ha7Var19.c.a.setVisibility(8);
                        Unit unit61110 = Unit.a;
                    }
                    this.a = null;
                    this.b = null;
                    this.C = i2;
                    this.G = 6;
                    if (hkd.b(500L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                }
                Unit unit61111 = Unit.a;
                return Unit.a;
            case 2:
                int i15 = this.C;
                z13 = this.B;
                z12 = this.A;
                str34 = this.z;
                str31 = this.y;
                str30 = this.w;
                String str54 = this.v;
                str32 = this.i;
                str36 = this.f;
                String str55 = this.e;
                String str56 = this.d;
                String str57 = this.c;
                ChatActivity chatActivity7 = this.b;
                str35 = (String) this.a;
                uj50.b(obj);
                str45 = "CRASH_BET_RECORD";
                i9 = i15;
                str4 = "ONE_PUNCH_RECORD";
                obj3 = "OVER_UNDER_BET_RECORD";
                obj4 = "RANGE_BET_RECORD";
                obj2 = "BET_RECORD";
                str33 = str54;
                str5 = str55;
                str28 = str57;
                chatActivity4 = chatActivity7;
                str44 = "PR_BET_RECORD";
                str29 = str56;
                z5 = z13;
                z4 = z12;
                str14 = str28;
                str16 = str33;
                str11 = str34;
                str17 = str31;
                chatActivity2 = chatActivity4;
                str15 = str32;
                str6 = str36;
                str19 = str29;
                str18 = str30;
                str20 = str5;
                str21 = str35;
                i2 = i9;
                dH = kotlin.text.b.h(str18);
                if (dH != null) {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31110 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4116 = Unit.a;
                    }
                } else {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31111 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4117 = Unit.a;
                    }
                }
                if (!c.l(str21, str43, false)) {
                    ha7Var18 = (ha7) chatActivity2.a;
                    if (ha7Var18 != null) {
                        ha7Var18.c.a.setVisibility(0);
                        Unit unit61112 = Unit.a;
                    }
                    this.a = chatActivity2;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = null;
                    this.C = i2;
                    this.G = 5;
                    if (hkd.b(1800L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                    ha7Var19 = (ha7) chatActivity2.a;
                    if (ha7Var19 != null) {
                        ha7Var19.c.a.setVisibility(8);
                        Unit unit61113 = Unit.a;
                    }
                    this.a = null;
                    this.b = null;
                    this.C = i2;
                    this.G = 6;
                    if (hkd.b(500L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                }
                Unit unit61114 = Unit.a;
                return Unit.a;
            case 3:
                double d7 = this.F;
                double d8 = this.E;
                double d9 = this.D;
                int i16 = this.C;
                z7 = this.B;
                boolean z17 = this.A;
                String str58 = this.z;
                String str59 = this.y;
                String str60 = this.w;
                String str61 = this.v;
                String str62 = this.i;
                String str63 = this.f;
                String str64 = this.e;
                String str65 = this.d;
                String str66 = this.c;
                ChatActivity chatActivity8 = this.b;
                String str67 = (String) this.a;
                uj50.b(obj);
                str = str67;
                str23 = str58;
                i3 = i16;
                y5bVar2 = y5bVar5;
                str4 = "ONE_PUNCH_RECORD";
                obj3 = "OVER_UNDER_BET_RECORD";
                obj4 = "RANGE_BET_RECORD";
                obj2 = "BET_RECORD";
                str25 = str61;
                str6 = str63;
                str5 = str64;
                str2 = str66;
                chatActivity3 = chatActivity8;
                d4 = d9;
                z6 = z17;
                str10 = str59;
                d5 = d7;
                str45 = "CRASH_BET_RECORD";
                str24 = str62;
                d6 = d8;
                str26 = str60;
                str44 = "PR_BET_RECORD";
                str3 = str65;
                i10 = i3;
                ((x5a0) chatActivity3.r0).setValue(Boolean.FALSE);
                this.a = str;
                this.b = chatActivity3;
                this.c = str2;
                this.d = str3;
                this.e = str5;
                this.f = str6;
                this.i = str24;
                this.v = str25;
                this.w = str26;
                this.y = str10;
                this.z = str23;
                this.A = z6;
                this.B = z7;
                this.C = i10;
                chatActivity5 = chatActivity3;
                str37 = str23;
                this.D = d4;
                this.E = d6;
                this.F = d5;
                this.G = 4;
                y5bVar5 = y5bVar2;
                if (hkd.b(500L, this) == y5bVar5) {
                    return y5bVar5;
                }
                str38 = str;
                str39 = str6;
                str40 = str10;
                z14 = z7;
                str41 = str25;
                str18 = str26;
                z15 = z6;
                str42 = str24;
                str17 = str40;
                z5 = z14;
                str14 = str2;
                z4 = z15;
                chatActivity2 = chatActivity5;
                str16 = str41;
                str15 = str42;
                str6 = str39;
                str11 = str37;
                str19 = str3;
                str20 = str5;
                str21 = str38;
                i2 = i10;
                dH = kotlin.text.b.h(str18);
                if (dH != null) {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31112 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4118 = Unit.a;
                    }
                } else {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31113 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit4119 = Unit.a;
                    }
                }
                if (!c.l(str21, str43, false)) {
                    ha7Var18 = (ha7) chatActivity2.a;
                    if (ha7Var18 != null) {
                        ha7Var18.c.a.setVisibility(0);
                        Unit unit61115 = Unit.a;
                    }
                    this.a = chatActivity2;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = null;
                    this.C = i2;
                    this.G = 5;
                    if (hkd.b(1800L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                    ha7Var19 = (ha7) chatActivity2.a;
                    if (ha7Var19 != null) {
                        ha7Var19.c.a.setVisibility(8);
                        Unit unit61116 = Unit.a;
                    }
                    this.a = null;
                    this.b = null;
                    this.C = i2;
                    this.G = 6;
                    if (hkd.b(500L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                }
                Unit unit61117 = Unit.a;
                return Unit.a;
            case 4:
                int i17 = this.C;
                z14 = this.B;
                z15 = this.A;
                String str68 = this.z;
                str40 = this.y;
                str18 = this.w;
                str41 = this.v;
                str42 = this.i;
                str39 = this.f;
                String str69 = this.e;
                String str70 = this.d;
                String str71 = this.c;
                ChatActivity chatActivity9 = this.b;
                str38 = (String) this.a;
                uj50.b(obj);
                str4 = "ONE_PUNCH_RECORD";
                obj3 = "OVER_UNDER_BET_RECORD";
                obj4 = "RANGE_BET_RECORD";
                obj2 = "BET_RECORD";
                i10 = i17;
                str5 = str69;
                str2 = str71;
                str44 = "PR_BET_RECORD";
                str45 = "CRASH_BET_RECORD";
                str3 = str70;
                str37 = str68;
                chatActivity5 = chatActivity9;
                str17 = str40;
                z5 = z14;
                str14 = str2;
                z4 = z15;
                chatActivity2 = chatActivity5;
                str16 = str41;
                str15 = str42;
                str6 = str39;
                str11 = str37;
                str19 = str3;
                str20 = str5;
                str21 = str38;
                i2 = i10;
                dH = kotlin.text.b.h(str18);
                if (dH != null) {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31114 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit41110 = Unit.a;
                    }
                } else {
                    str43 = str45;
                    ha7Var16 = (ha7) chatActivity2.a;
                    if (ha7Var16 != null) {
                        i11 = 8;
                        ha7Var16.c.A.setVisibility(8);
                        Unit unit31115 = Unit.a;
                    } else {
                        i11 = 8;
                    }
                    ha7Var17 = (ha7) chatActivity2.a;
                    if (ha7Var17 != null) {
                        ha7Var17.c.B.setVisibility(i11);
                        Unit unit41111 = Unit.a;
                    }
                }
                if (!c.l(str21, str43, false)) {
                    ha7Var18 = (ha7) chatActivity2.a;
                    if (ha7Var18 != null) {
                        ha7Var18.c.a.setVisibility(0);
                        Unit unit61118 = Unit.a;
                    }
                    this.a = chatActivity2;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = null;
                    this.C = i2;
                    this.G = 5;
                    if (hkd.b(1800L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                    ha7Var19 = (ha7) chatActivity2.a;
                    if (ha7Var19 != null) {
                        ha7Var19.c.a.setVisibility(8);
                        Unit unit61119 = Unit.a;
                    }
                    this.a = null;
                    this.b = null;
                    this.C = i2;
                    this.G = 6;
                    if (hkd.b(500L, this) == y5bVar5) {
                        return y5bVar5;
                    }
                }
                Unit unit611110 = Unit.a;
                return Unit.a;
            case 5:
                i2 = this.C;
                chatActivity2 = (ChatActivity) this.a;
                uj50.b(obj);
                ha7Var19 = (ha7) chatActivity2.a;
                if (ha7Var19 != null) {
                    ha7Var19.c.a.setVisibility(8);
                    Unit unit611111 = Unit.a;
                }
                this.a = null;
                this.b = null;
                this.C = i2;
                this.G = 6;
                if (hkd.b(500L, this) == y5bVar5) {
                    return y5bVar5;
                }
                Unit unit611112 = Unit.a;
                return Unit.a;
            case 6:
                uj50.b(obj);
                Unit unit611113 = Unit.a;
                return Unit.a;
            default:
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
