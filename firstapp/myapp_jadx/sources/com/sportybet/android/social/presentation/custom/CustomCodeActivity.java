package com.sportybet.android.social.presentation.custom;

import android.os.Bundle;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.domain.CustomCodes;
import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import com.sportybet.android.social.presentation.custom.CustomCodeActivity.a;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import defpackage.azm;
import defpackage.b190;
import defpackage.bb40;
import defpackage.bdc;
import defpackage.c0d;
import defpackage.c190;
import defpackage.crh0;
import defpackage.cyb;
import defpackage.g880;
import defpackage.g93;
import defpackage.hxa;
import defpackage.ib5;
import defpackage.iu2;
import defpackage.jq40;
import defpackage.kpl;
import defpackage.o7d;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.sh8;
import defpackage.t090;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.w6c;
import defpackage.w8c;
import defpackage.wae;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zn8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/social/presentation/custom/CustomCodeActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CustomCodeActivity extends kpl implements bb40 {
    public static final /* synthetic */ int f = 0;
    public azm b;
    public t090 c;
    public w8c d;
    public final q8i0 e = new q8i0(jq40.a(bdc.class), new c(), new b(), new d());

    @c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeActivity$onCreate$1$5$1$1", f = "CustomCodeActivity.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BookingData e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, BookingData bookingData, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
            this.e = bookingData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return CustomCodeActivity.this.new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                int i2 = CustomCodeActivity.f;
                if (CustomCodeActivity.this.z1(this.c, this.d, this.e, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CustomCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CustomCodeActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CustomCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(1030985296, new Function2() { // from class: q6c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CustomCodes customCodes;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = CustomCodeActivity.f;
                int i2 = 0;
                int i3 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hjx hjxVarA = tix.a(new vkx[0], aVar);
                    d dVarE = j.e(d.a.b, 1.0f);
                    final CustomCodeActivity customCodeActivity = this.a;
                    bdc bdcVar = (bdc) customCodeActivity.e.getValue();
                    Bundle extras = customCodeActivity.getIntent().getExtras();
                    if (extras == null || (customCodes = (CustomCodes) extras.getParcelable("arg_custom_codes_data")) == null) {
                        CustomCodes.INSTANCE.getClass();
                        customCodes = CustomCodes.c;
                    }
                    boolean zA = aVar.A(hjxVarA) | aVar.A(customCodeActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new r6c(i2, hjxVarA, customCodeActivity);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(customCodeActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new s6c(customCodeActivity, i2);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(customCodeActivity);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new t6c(customCodeActivity, i2);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    Object objY4 = aVar.y();
                    if (objY4 == c0042a) {
                        objY4 = new xe3(i3);
                        aVar.r(objY4);
                    }
                    Function1 function3 = (Function1) objY4;
                    boolean zA4 = aVar.A(customCodeActivity);
                    Object objY5 = aVar.y();
                    if (zA4 || objY5 == c0042a) {
                        objY5 = new gaj() { // from class: u6c
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String str = (String) obj3;
                                String str2 = (String) obj4;
                                BookingData bookingData = (BookingData) obj5;
                                int i4 = CustomCodeActivity.f;
                                str.getClass();
                                str2.getClass();
                                bookingData.getClass();
                                CustomCodeActivity customCodeActivity2 = customCodeActivity;
                                ej5.c(ebs.a(customCodeActivity2.getLifecycle()), null, null, customCodeActivity2.new a(str, str2, bookingData, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY5);
                    }
                    gaj gajVar = (gaj) objY5;
                    boolean zA5 = aVar.A(customCodeActivity);
                    Object objY6 = aVar.y();
                    if (zA5 || objY6 == c0042a) {
                        objY6 = new v6c(customCodeActivity);
                        aVar.r(objY6);
                    }
                    cac.a(dVarE, hjxVarA, bdcVar, customCodes, function0, function1, function2, function3, gajVar, (Function2) objY6, null, aVar, 12583494 | (CustomCodes.b << 9));
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object z1(String str, String str2, BookingData bookingData, x1b x1bVar) {
        w6c w6cVar;
        String str3;
        String strA;
        ArrayList arrayList;
        List list;
        String str4 = str;
        BookingData bookingData2 = bookingData;
        if (x1bVar instanceof w6c) {
            w6cVar = (w6c) x1bVar;
            int i = w6cVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6cVar.v = i - Integer.MIN_VALUE;
            } else {
                w6cVar = new w6c(this, x1bVar);
            }
        } else {
            w6cVar = new w6c(this, x1bVar);
        }
        Object obj = w6cVar.f;
        y5b y5bVar = y5b.a;
        int i2 = w6cVar.v;
        if (i2 == 0) {
            uj50.b(obj);
            if (str4.length() == 0 || str2.length() == 0 || (str3 = bookingData2.shareCode) == null || str3.length() == 0) {
                return Unit.a;
            }
            List<Event> list2 = bookingData2.outcomes;
            if (list2 == null) {
                return Unit.a;
            }
            w8c w8cVar = this.d;
            if (w8cVar == null) {
                Intrinsics.n("customCodeJoiner");
                throw null;
            }
            strA = w8cVar.a(str4, str2);
            arrayList = new ArrayList(iu2.d());
            iu2.b();
            for (Event event : list2) {
                List<Market> list3 = event.markets;
                if (list3 != null) {
                    for (Market market : list3) {
                        Iterator<Outcome> it = market.outcomes.iterator();
                        while (it.hasNext()) {
                            iu2.t(event, market, it.next(), true, false, null, 16368);
                        }
                    }
                }
            }
            g93.b(new Share(bookingData2.shareCode, strA));
            List listA0 = CollectionsKt.A0(iu2.d());
            String lastNickName = getAccountHelper().getLastNickName();
            t090 t090Var = this.c;
            if (t090Var == null) {
                Intrinsics.n("shareImageProvider");
                throw null;
            }
            String str5 = bookingData2.shareCode;
            if (str5 == null) {
                str5 = "";
            }
            b190 b190Var = new b190(listA0, str4, lastNickName, str5);
            w6cVar.a = str4;
            w6cVar.b = bookingData2;
            w6cVar.c = strA;
            w6cVar.d = arrayList;
            w6cVar.e = listA0;
            w6cVar.v = 1;
            Object objA = t090Var.a(b190Var, w6cVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            list = listA0;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = w6cVar.e;
            ArrayList arrayList2 = w6cVar.d;
            String str6 = w6cVar.c;
            BookingData bookingData3 = w6cVar.b;
            String str7 = w6cVar.a;
            uj50.b(obj);
            arrayList = arrayList2;
            strA = str6;
            str4 = str7;
            bookingData2 = bookingData3;
        }
        c190 c190Var = (c190) obj;
        String str8 = c190Var.a;
        String str9 = c190Var.b;
        iu2.b();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            Selection selection = (Selection) obj2;
            iu2.t(selection.a, selection.b, selection.c, true, false, null, 16368);
        }
        String strA2 = o7d.a(wae.SHARE);
        String str10 = bookingData2.shareCode;
        boolean zX = g880.x(list);
        StringBuilder sbA = crh0.a(strA2, "?imageUri=", str8, "&imageWithUserUri=", str9);
        hxa.c(sbA, "&linkUrl=", strA, "&customCode=", str4);
        sbA.append("&shareCode=");
        sbA.append(str10);
        sbA.append("&isSingleBetBuilder=");
        sbA.append(zX);
        sbA.append("&source=custom_code");
        sh8.c().e(sbA.toString());
        return Unit.a;
    }
}
