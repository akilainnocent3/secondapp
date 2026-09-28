package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.ChatRoomInfo;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LeaveChatroomData;
import com.sporty.android.chat.data.RemoveMessageData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Ltd7;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "g", "b", "e", "c", "f", "a", "d", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class td7 extends Fragment {
    public ConstraintLayout A;
    public kjs F;
    public qrr a;
    public be7 b;
    public int d;
    public int e;
    public boolean f;
    public com.google.android.material.bottomsheet.b w;
    public orr y;
    public boolean z;
    public final g c = new g();
    public final aa7 i = new aa7(new aa7.b());
    public final l590 v = new l590(new l590.a());
    public final i B = new i();
    public final long C = 5000;
    public final mpe0 D = hwr.b(new Function0() { // from class: kd7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final td7 td7Var = this.a;
            return new Runnable() { // from class: id7
                @Override // java.lang.Runnable
                public final void run() {
                    td7Var.m0().D.m(ad7.f);
                }
            };
        }
    });
    public final mpe0 E = hwr.b(new ld7());

    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            view.getClass();
            td7 td7Var = td7.this;
            qrr qrrVar = td7Var.a;
            qrrVar.getClass();
            qrrVar.c.i.setTag(null);
            td7Var.m0().D.m(ad7.A);
            td7Var.m0().y1();
        }
    }

    public final class b implements View.OnClickListener {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            td7 td7Var = td7.this;
            androidx.fragment.app.e activity = td7Var.getActivity();
            Object systemService = activity != null ? activity.getSystemService("clipboard") : null;
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Label", ((ChatMessage) td7Var.i.a.f.get(this.a)).getConversation()));
            com.google.android.material.bottomsheet.b bVar = td7Var.w;
            if (bVar != null) {
                bVar.dismiss();
            } else {
                Intrinsics.n("bottomSheetDialog");
                throw null;
            }
        }
    }

    public final class c implements View.OnClickListener {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            td7 td7Var = td7.this;
            be7 be7VarM0 = td7Var.m0();
            int messageNo = ((ChatMessage) td7Var.i.a.f.get(this.a)).getMessageNo();
            if (be7VarM0.W.length() != 0) {
                RemoveMessageData removeMessageData = new RemoveMessageData(be7VarM0.W, messageNo);
                ema emaVar = be7VarM0.Q;
                jc7 jc7Var = be7VarM0.d;
                if (jc7Var == null) {
                    Intrinsics.n("chatRepo");
                    throw null;
                }
                ct90<bi50<DefaultCommand>> ct90VarD = jc7Var.d(removeMessageData);
                qm70 qm70Var = wm70.c;
                ct90<bi50<DefaultCommand>> ct90VarB = ct90VarD.d(qm70Var).b(qm70Var);
                he7 he7Var = new he7(be7VarM0, messageNo);
                ct90VarB.a(he7Var);
                emaVar.b(he7Var);
            }
            com.google.android.material.bottomsheet.b bVar = td7Var.w;
            if (bVar != null) {
                bVar.dismiss();
            } else {
                Intrinsics.n("bottomSheetDialog");
                throw null;
            }
        }
    }

    public final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int itemCount;
            view.getClass();
            td7 td7Var = td7.this;
            qrr qrrVar = td7Var.a;
            qrrVar.getClass();
            RecyclerView.o layoutManager = qrrVar.v.getLayoutManager();
            if (layoutManager == null || (itemCount = td7Var.i.getItemCount() - 1) <= -1) {
                return;
            }
            layoutManager.H0(itemCount);
        }
    }

    public final class e implements View.OnClickListener {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            td7 td7Var = td7.this;
            String strA = tug.a("@", ((ChatMessage) td7Var.i.a.f.get(this.a)).getUserInfo().getNickname(), ": ");
            qrr qrrVar = td7Var.a;
            qrrVar.getClass();
            qrrVar.A.setText(strA);
            qrr qrrVar2 = td7Var.a;
            qrrVar2.getClass();
            qrrVar2.A.setSelection(strA.length());
            com.google.android.material.bottomsheet.b bVar = td7Var.w;
            if (bVar != null) {
                bVar.dismiss();
            } else {
                Intrinsics.n("bottomSheetDialog");
                throw null;
            }
        }
    }

    public final class f extends tih {
        public f(LinearLayoutManager linearLayoutManager) {
            super(linearLayoutManager);
        }

        @Override // defpackage.tih
        public final void c(boolean z) {
            td7 td7Var = td7.this;
            if (z) {
                kd2.a(8, td7Var.m0().v, null);
            } else if (((Number) td7Var.m0().e.getValue()).intValue() == 8) {
                kd2.a(0, td7Var.m0().v, null);
            }
            td7Var.m0().c0 = z;
        }
    }

    public final class g implements View.OnFocusChangeListener {
        public g() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            view.getClass();
            td7 td7Var = td7.this;
            if (!z) {
                qrr qrrVar = td7Var.a;
                qrrVar.getClass();
                qrrVar.z.setVisibility(0);
                view.setPadding(zch0.a(td7Var.getActivity(), 32), 0, 0, 0);
                td7Var.m0().A1();
                return;
            }
            if (td7Var.m0().Z.length() > 0 && td7Var.m0().a0.length() > 0) {
                qrr qrrVar2 = td7Var.a;
                qrrVar2.getClass();
                qrrVar2.z.setVisibility(8);
                view.setPadding(zch0.a(td7Var.getActivity(), 8), 0, 0, 0);
                lop.c(view);
                return;
            }
            if (td7Var.m0().Z.length() == 0) {
                td7Var.m0().A1();
                td7Var.m0().D.m(ad7.a);
            } else {
                td7Var.m0().A1();
                td7Var.m0().D.m(ad7.d);
            }
        }
    }

    public static final /* synthetic */ class h {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ad7.values().length];
            try {
                ad7 ad7Var = ad7.a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ad7 ad7Var2 = ad7.a;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ad7 ad7Var3 = ad7.a;
                iArr[11] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[c7i0.values().length];
            try {
                c7i0.a aVar = c7i0.b;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public static final class i implements dl40.a {
        public i() {
        }

        @Override // dl40.a
        public final void a(int i) {
            int color;
            td7 td7Var = td7.this;
            aa7 aa7Var = td7Var.i;
            if (i == -1 || i >= aa7Var.getItemCount() || rvi.b(td7Var)) {
                return;
            }
            be7 be7VarM0 = td7Var.m0();
            Object obj = aa7Var.a.f.get(i);
            obj.getClass();
            boolean zEquals = TextUtils.equals(((ChatMessage) obj).getPostUserId(), be7VarM0.Z);
            orr orrVar = td7Var.y;
            if (zEquals) {
                if (orrVar == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar.c.setText(sn5.d(td7Var, R.string.common_functions__copy, new Object[0]));
                orr orrVar2 = td7Var.y;
                if (orrVar2 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar2.c.setOnClickListener(td7Var.new b(i));
                orr orrVar3 = td7Var.y;
                if (orrVar3 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar3.d.setText(sn5.d(td7Var, R.string.common_functions__delete, new Object[0]));
                orr orrVar4 = td7Var.y;
                if (orrVar4 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                TextView textView = orrVar4.d;
                Resources resources = td7Var.getResources();
                ThreadLocal<TypedValue> threadLocal = th50.a;
                textView.setTextColor(resources.getColor(R.color.brand_primary, null));
                orr orrVar5 = td7Var.y;
                if (orrVar5 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar5.d.setOnClickListener(td7Var.new c(i));
            } else {
                if (orrVar == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar.c.setText(sn5.d(td7Var, R.string.common_functions__reply, new Object[0]));
                orr orrVar6 = td7Var.y;
                if (orrVar6 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar6.c.setOnClickListener(td7Var.new e(i));
                orr orrVar7 = td7Var.y;
                if (orrVar7 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar7.d.setText(sn5.d(td7Var, R.string.common_functions__copy, new Object[0]));
                orr orrVar8 = td7Var.y;
                if (orrVar8 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                TextView textView2 = orrVar8.d;
                n1b n1bVarQ0 = td7Var.q0();
                TypedValue typedValue = new TypedValue();
                n1bVarQ0.getTheme().resolveAttribute(R.attr.chatTextPrimary, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources resources2 = n1bVarQ0.getResources();
                    int i2 = typedValue.resourceId;
                    Resources.Theme theme = n1bVarQ0.getTheme();
                    ThreadLocal<TypedValue> threadLocal2 = th50.a;
                    color = resources2.getColor(i2, theme);
                } else {
                    color = typedValue.data;
                }
                textView2.setTextColor(color);
                orr orrVar9 = td7Var.y;
                if (orrVar9 == null) {
                    Intrinsics.n("dialogBinding");
                    throw null;
                }
                orrVar9.d.setOnClickListener(td7Var.new b(i));
            }
            com.google.android.material.bottomsheet.b bVar = td7Var.w;
            if (bVar != null) {
                bVar.show();
            } else {
                Intrinsics.n("bottomSheetDialog");
                throw null;
            }
        }
    }

    @c0d(c = "com.sporty.android.chat.ChatRoomFragment$onCreateView$1", f = "ChatRoomFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = td7.this.new j(v1bVar);
            jVar.a = ((Number) obj).intValue();
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((j) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qrr qrrVar = td7.this.a;
            qrrVar.getClass();
            qrrVar.H.setVisibility(i);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.chat.ChatRoomFragment$onCreateView$2", f = "ChatRoomFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = td7.this.new k(v1bVar);
            kVar.a = ((Number) obj).intValue();
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((k) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qrr qrrVar = td7.this.a;
            qrrVar.getClass();
            qrrVar.D.setVisibility(i);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.chat.ChatRoomFragment$onCreateView$3", f = "ChatRoomFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = td7.this.new l(v1bVar);
            lVar.a = ((Number) obj).intValue();
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((l) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qrr qrrVar = td7.this.a;
            qrrVar.getClass();
            qrrVar.I.setVisibility(i);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.chat.ChatRoomFragment$onCreateView$4", f = "ChatRoomFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;

        public m(v1b<? super m> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m mVar = td7.this.new m(v1bVar);
            mVar.a = ((Number) obj).intValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((m) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qrr qrrVar = td7.this.a;
            qrrVar.getClass();
            qrrVar.C.setVisibility(i);
            return Unit.a;
        }
    }

    public static final class n implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public n(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public final void j0(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (((Number) m0().f.getValue()).intValue() == 0) {
            Rect rect = new Rect();
            qrr qrrVar = this.a;
            qrrVar.getClass();
            qrrVar.D.getGlobalVisibleRect(rect);
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            kd2.a(8, m0().f, null);
        }
    }

    public final be7 m0() {
        be7 be7Var = this.b;
        if (be7Var != null) {
            return be7Var;
        }
        Intrinsics.n("mViewModel");
        throw null;
    }

    public final void n0(boolean z) {
        Boolean boolD = m0().A.d();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.g(boolD, bool)) {
            return;
        }
        m0().A.m(bool);
        ((Handler) this.E.getValue()).removeCallbacks((Runnable) this.D.getValue());
        p0();
        be7 be7VarM0 = m0();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ema emaVar = be7VarM0.Q;
        jc7 jc7Var = be7VarM0.d;
        if (jc7Var == null) {
            Intrinsics.n("chatRepo");
            throw null;
        }
        ct90<bi50<ChatRoomInfo>> ct90VarC = jc7Var.c(be7VarM0.V);
        qm70 qm70Var = wm70.c;
        dw90 dw90VarB = new lu90(ct90VarC.d(qm70Var), new de7(be7VarM0, linkedHashMap, z)).b(qm70Var);
        ee7 ee7Var = new ee7(be7VarM0, linkedHashMap, z);
        dw90VarB.a(ee7Var);
        emaVar.b(ee7Var);
    }

    public final void o0() {
        qrr qrrVar = this.a;
        qrrVar.getClass();
        qrrVar.y.setVisibility(8);
        wwd0 wwd0Var = m0().e;
        wwd0Var.getClass();
        wwd0Var.k(null, 0);
        n0(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        o0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f = arguments != null ? arguments.getBoolean("arg_hide_share_button", false) : false;
        Bundle arguments2 = getArguments();
        this.z = arguments2 != null ? arguments2.getBoolean("arg_force_dark_mode", false) : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.layout_chat_room, viewGroup, false);
        int i2 = R.id.all_country;
        View viewA = h5e.a(R.id.all_country, viewInflate);
        if (viewA != null) {
            n2p n2pVarA = n2p.a(viewA);
            i2 = R.id.booking_code_preview;
            View viewA2 = h5e.a(R.id.booking_code_preview, viewInflate);
            if (viewA2 != null) {
                m2p m2pVarA = m2p.a(viewA2);
                i2 = R.id.bottom_area;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.bottom_area, viewInflate);
                if (constraintLayout != null) {
                    i2 = R.id.btn_close;
                    ImageButton imageButton = (ImageButton) h5e.a(R.id.btn_close, viewInflate);
                    if (imageButton != null) {
                        i2 = R.id.btn_info;
                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.btn_info, viewInflate);
                        if (imageButton2 != null) {
                            i2 = R.id.btn_send;
                            ImageButton imageButton3 = (ImageButton) h5e.a(R.id.btn_send, viewInflate);
                            if (imageButton3 != null) {
                                i2 = R.id.chat_recycle_view;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.chat_recycle_view, viewInflate);
                                if (recyclerView != null) {
                                    i2 = R.id.country_filter_card;
                                    if (((CardView) h5e.a(R.id.country_filter_card, viewInflate)) != null) {
                                        i2 = R.id.country_filter_icon;
                                        ImageButton imageButton4 = (ImageButton) h5e.a(R.id.country_filter_icon, viewInflate);
                                        if (imageButton4 != null) {
                                            i2 = R.id.error_view;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.error_view, viewInflate);
                                            if (constraintLayout2 != null) {
                                                i2 = R.id.img_edit;
                                                ImageView imageView = (ImageView) h5e.a(R.id.img_edit, viewInflate);
                                                if (imageView != null) {
                                                    i2 = R.id.img_status_icon;
                                                    if (((ImageView) h5e.a(R.id.img_status_icon, viewInflate)) != null) {
                                                        i2 = R.id.input;
                                                        EditText editText = (EditText) h5e.a(R.id.input, viewInflate);
                                                        if (editText != null) {
                                                            i2 = R.id.input_share_btn;
                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.input_share_btn, viewInflate);
                                                            if (imageView2 != null) {
                                                                i2 = R.id.jump_to_bottom;
                                                                ImageButton imageButton5 = (ImageButton) h5e.a(R.id.jump_to_bottom, viewInflate);
                                                                if (imageButton5 != null) {
                                                                    i2 = R.id.layout_country_filter;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.layout_country_filter, viewInflate);
                                                                    if (constraintLayout3 != null) {
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                                                        i2 = R.id.my_country;
                                                                        View viewA3 = h5e.a(R.id.my_country, viewInflate);
                                                                        if (viewA3 != null) {
                                                                            n2p n2pVarA2 = n2p.a(viewA3);
                                                                            i2 = R.id.overlay_bottom;
                                                                            View viewA4 = h5e.a(R.id.overlay_bottom, viewInflate);
                                                                            if (viewA4 != null) {
                                                                                i2 = R.id.progress;
                                                                                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress, viewInflate);
                                                                                if (progressBar != null) {
                                                                                    i2 = R.id.text_filter;
                                                                                    if (((TextView) h5e.a(R.id.text_filter, viewInflate)) != null) {
                                                                                        i2 = R.id.text_length_info;
                                                                                        TextView textView = (TextView) h5e.a(R.id.text_length_info, viewInflate);
                                                                                        if (textView != null) {
                                                                                            i2 = R.id.top_area;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.top_area, viewInflate)) != null) {
                                                                                                i2 = R.id.top_divider;
                                                                                                View viewA5 = h5e.a(R.id.top_divider, viewInflate);
                                                                                                if (viewA5 != null) {
                                                                                                    this.a = new qrr(constraintLayout4, n2pVarA, m2pVarA, constraintLayout, imageButton, imageButton2, imageButton3, recyclerView, imageButton4, constraintLayout2, imageView, editText, imageView2, imageButton5, constraintLayout3, constraintLayout4, n2pVarA2, viewA4, progressBar, textView, viewA5);
                                                                                                    androidx.fragment.app.e eVarRequireActivity = requireActivity();
                                                                                                    eVarRequireActivity.getClass();
                                                                                                    v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
                                                                                                    r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
                                                                                                    s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
                                                                                                    dq7 dq7VarA = jq40.a(be7.class);
                                                                                                    String strI = dq7VarA.i();
                                                                                                    if (strI == null) {
                                                                                                        hb5.a("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    this.b = (be7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                                                                                                    g1i g1iVar = new g1i(m0().e, new j(null));
                                                                                                    s9s lifecycle = getViewLifecycleOwner().getLifecycle();
                                                                                                    lifecycle.getClass();
                                                                                                    s9s.b bVar = s9s.b.d;
                                                                                                    arr.a(g1iVar, lifecycle, bVar);
                                                                                                    g1i g1iVar2 = new g1i(m0().f, new k(null));
                                                                                                    s9s lifecycle2 = getViewLifecycleOwner().getLifecycle();
                                                                                                    lifecycle2.getClass();
                                                                                                    arr.a(g1iVar2, lifecycle2, bVar);
                                                                                                    g1i g1iVar3 = new g1i(m0().i, new l(null));
                                                                                                    s9s lifecycle3 = getViewLifecycleOwner().getLifecycle();
                                                                                                    lifecycle3.getClass();
                                                                                                    arr.a(g1iVar3, lifecycle3, bVar);
                                                                                                    g1i g1iVar4 = new g1i(m0().v, new m(null));
                                                                                                    s9s lifecycle4 = getViewLifecycleOwner().getLifecycle();
                                                                                                    lifecycle4.getClass();
                                                                                                    arr.a(g1iVar4, lifecycle4, bVar);
                                                                                                    qrr qrrVar = this.a;
                                                                                                    qrrVar.getClass();
                                                                                                    qrrVar.e.setOnClickListener(m0().J);
                                                                                                    qrr qrrVar2 = this.a;
                                                                                                    qrrVar2.getClass();
                                                                                                    qrrVar2.w.setOnClickListener(m0().K);
                                                                                                    qrr qrrVar3 = this.a;
                                                                                                    qrrVar3.getClass();
                                                                                                    qrrVar3.f.setOnClickListener(m0().N);
                                                                                                    qrr qrrVar4 = this.a;
                                                                                                    qrrVar4.getClass();
                                                                                                    qrrVar4.B.setOnClickListener(m0().M);
                                                                                                    qrr qrrVar5 = this.a;
                                                                                                    qrrVar5.getClass();
                                                                                                    qrrVar5.B.setVisibility(this.f ? 8 : 0);
                                                                                                    qrr qrrVar6 = this.a;
                                                                                                    qrrVar6.getClass();
                                                                                                    qrrVar6.i.setOnClickListener(m0().L);
                                                                                                    qrr qrrVar7 = this.a;
                                                                                                    qrrVar7.getClass();
                                                                                                    qrrVar7.b.d.setTag(c7i0.AllCountries);
                                                                                                    qrr qrrVar8 = this.a;
                                                                                                    qrrVar8.getClass();
                                                                                                    qrrVar8.b.d.setOnClickListener(m0().P);
                                                                                                    qrr qrrVar9 = this.a;
                                                                                                    qrrVar9.getClass();
                                                                                                    qrrVar9.F.d.setTag(c7i0.MyCountry);
                                                                                                    qrr qrrVar10 = this.a;
                                                                                                    qrrVar10.getClass();
                                                                                                    qrrVar10.F.d.setOnClickListener(m0().P);
                                                                                                    qrr qrrVar11 = this.a;
                                                                                                    qrrVar11.getClass();
                                                                                                    ConstraintLayout constraintLayout5 = qrrVar11.a;
                                                                                                    constraintLayout5.getClass();
                                                                                                    return constraintLayout5;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((Handler) this.E.getValue()).removeCallbacksAndMessages(null);
        super.onDestroyView();
        this.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(q0());
        layoutInflaterCloneInContext.getClass();
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        if (!z) {
            o0();
            return;
        }
        ((Handler) this.E.getValue()).removeCallbacks((Runnable) this.D.getValue());
        p0();
        be7 be7VarM0 = m0();
        if (be7VarM0.Z.length() != 0 && be7VarM0.W.length() != 0) {
            LeaveChatroomData leaveChatroomData = new LeaveChatroomData(be7VarM0.W);
            ema emaVar = be7VarM0.Q;
            jc7 jc7Var = be7VarM0.d;
            if (jc7Var == null) {
                Intrinsics.n("chatRepo");
                throw null;
            }
            ct90<bi50<ResponseBody>> ct90VarG = jc7Var.g(leaveChatroomData);
            qm70 qm70Var = wm70.c;
            ct90<bi50<ResponseBody>> ct90VarB = ct90VarG.d(qm70Var).b(qm70Var);
            ge7 ge7Var = new ge7(be7VarM0);
            ct90VarB.a(ge7Var);
            emaVar.b(ge7Var);
        }
        com.google.android.material.bottomsheet.b bVar = this.w;
        if (bVar == null) {
            Intrinsics.n("bottomSheetDialog");
            throw null;
        }
        bVar.dismiss();
        wwd0 wwd0Var = m0().f;
        wwd0Var.getClass();
        wwd0Var.k(null, 8);
        wwd0 wwd0Var2 = m0().v;
        wwd0Var2.getClass();
        wwd0Var2.k(null, 8);
        m0().D.m(ad7.A);
        m0().A1();
        be7 be7VarM1 = m0();
        be7VarM1.D1("", null, "");
        be7VarM1.W = "";
        be7VarM1.Y = 0;
        be7VarM1.X = 0;
        be7VarM1.y.m("");
        be7VarM1.O.m(m2g.a);
        be7VarM1.c0 = false;
        ssw<Boolean> sswVar = be7VarM1.B;
        Boolean bool = Boolean.FALSE;
        sswVar.m(bool);
        be7VarM1.A.m(bool);
        be7VarM1.z.m(bool);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        this.d = getResources().getInteger(R.integer.live_chat_text_max_length);
        this.e = getResources().getInteger(R.integer.live_chat_text_threshold);
        qrr qrrVar = this.a;
        qrrVar.getClass();
        qrrVar.A.setOnFocusChangeListener(this.c);
        qrr qrrVar2 = this.a;
        qrrVar2.getClass();
        qrrVar2.A.setOnClickListener(new View.OnClickListener() { // from class: cd7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                td7 td7Var = this.a;
                if (td7Var.m0().Z.length() <= 0 || td7Var.m0().a0.length() <= 0) {
                    return;
                }
                qrr qrrVar3 = td7Var.a;
                qrrVar3.getClass();
                lop.c(qrrVar3.A);
            }
        });
        int i2 = 0;
        dd7 dd7Var = new dd7(this, i2);
        ed7 ed7Var = new ed7(this, i2);
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        eVarRequireActivity.getOnBackPressedDispatcher().a(viewLifecycleOwner, new zr1(dd7Var, ed7Var, eVarRequireActivity));
        m2g m2gVar = m2g.a;
        l590 l590Var = this.v;
        l590Var.i(m2gVar);
        int i3 = 1;
        aa7 aa7Var = this.i;
        androidx.recyclerview.widget.f fVar = new androidx.recyclerview.widget.f(l590Var, aa7Var);
        qrr qrrVar3 = this.a;
        qrrVar3.getClass();
        qrrVar3.v.setAdapter(fVar);
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.y1(true);
        qrr qrrVar4 = this.a;
        qrrVar4.getClass();
        qrrVar4.v.setLayoutManager(linearLayoutManager);
        androidx.fragment.app.e activity = getActivity();
        qrr qrrVar5 = this.a;
        qrrVar5.getClass();
        RecyclerView recyclerView = qrrVar5.v;
        dl40 dl40Var = new dl40();
        dl40Var.a = this.B;
        dl40Var.b = new GestureDetector(activity, new cl40(dl40Var, recyclerView));
        qrr qrrVar6 = this.a;
        qrrVar6.getClass();
        qrrVar6.v.j(dl40Var);
        qrr qrrVar7 = this.a;
        qrrVar7.getClass();
        sn5.f(qrrVar7.F.e, R.string.live__my_country_only_2, new Object[0]);
        c7i0 c7i0VarD = m0().w.d();
        if (c7i0VarD != null) {
            s0(c7i0VarD);
        }
        qrr qrrVar8 = this.a;
        qrrVar8.getClass();
        qrrVar8.v.k(new f(linearLayoutManager));
        qrr qrrVar9 = this.a;
        qrrVar9.getClass();
        qrrVar9.C.setOnClickListener(new d());
        n1b n1bVarQ0 = q0();
        this.w = new com.google.android.material.bottomsheet.b(n1bVarQ0);
        View viewInflate = LayoutInflater.from(n1bVarQ0).inflate(R.layout.layout_bottom_sheet, (ViewGroup) null, false);
        int i4 = R.id.divider;
        View viewA = h5e.a(R.id.divider, viewInflate);
        if (viewA != null) {
            i4 = R.id.first_item;
            TextView textView = (TextView) h5e.a(R.id.first_item, viewInflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                TextView textView2 = (TextView) h5e.a(R.id.second_item, viewInflate);
                if (textView2 != null) {
                    this.y = new orr(constraintLayout, viewA, textView, textView2);
                    com.google.android.material.bottomsheet.b bVar = this.w;
                    if (bVar == null) {
                        Intrinsics.n("bottomSheetDialog");
                        throw null;
                    }
                    bVar.setContentView(constraintLayout);
                    com.google.android.material.bottomsheet.b bVar2 = this.w;
                    if (bVar2 == null) {
                        Intrinsics.n("bottomSheetDialog");
                        throw null;
                    }
                    Window window = bVar2.getWindow();
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    qrr qrrVar10 = this.a;
                    qrrVar10.getClass();
                    qrrVar10.f.setImageDrawable(iwh0.a(n1bVarQ0, R.drawable.ic_info_vector, -1));
                    qrr qrrVar11 = this.a;
                    qrrVar11.getClass();
                    qrrVar11.A.addTextChangedListener(new ud7(this));
                    qrr qrrVar12 = this.a;
                    qrrVar12.getClass();
                    this.A = qrrVar12.c.a;
                    qrr qrrVar13 = this.a;
                    qrrVar13.getClass();
                    qrrVar13.c.c.setOnClickListener(new a());
                    fd7 fd7Var = new fd7(this, i2);
                    aa7Var.getClass();
                    aa7Var.b = fd7Var;
                    m0().E.f(getViewLifecycleOwner(), new n(new md7(this, i2)));
                    m0().O.f(getViewLifecycleOwner(), new n(new nd7(this, i2)));
                    m0().w.f(getViewLifecycleOwner(), new n(new od7(this, 0)));
                    m0().y.f(getViewLifecycleOwner(), new n(new pd7(this, 0)));
                    m0().A.f(getViewLifecycleOwner(), new n(new qd7(this, i2)));
                    m0().z.f(getViewLifecycleOwner(), new n(new rd7(this, i2)));
                    m0().b0.f(getViewLifecycleOwner(), new n(new bd7(this, i2)));
                    m0().G.f(getViewLifecycleOwner(), new n(new ec2(this, i3)));
                    return;
                }
                i4 = R.id.second_item;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public final synchronized void p0() {
        kjs kjsVar = this.F;
        if (kjsVar != null) {
            pg7 pg7Var = pg7.a;
            pg7.g.k(kjsVar.d);
            pg7.f.k(kjsVar.c);
            pg7.a();
        }
        this.F = null;
    }

    public final n1b q0() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int i2 = this.z ? R.style.Theme_SportyChat_AlwaysDark : R.style.Theme_SportyChat_Default;
        n1b n1bVar = new n1b(contextRequireContext, 0);
        n1bVar.getTheme().setTo(contextRequireContext.getTheme());
        n1bVar.getTheme().applyStyle(i2, true);
        return n1bVar;
    }

    public final void r0(List<ChatMessage> list) {
        if (!list.isEmpty() && m0().w.d() == c7i0.MyCountry) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String country = ((ChatMessage) obj).getUserInfo().getCountry();
                CountryCodeName countryCodeNameD = m0().b0.d();
                if (kotlin.text.c.l(country, countryCodeNameD != null ? countryCodeNameD.getCode() : null, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.i.i(list);
        qrr qrrVar = this.a;
        qrrVar.getClass();
        qrrVar.y.setVisibility(list.isEmpty() ? 0 : 8);
    }

    public final void s0(c7i0 c7i0Var) {
        int i2 = h.b[c7i0Var.ordinal()];
        qrr qrrVar = this.a;
        if (i2 == 1) {
            qrrVar.getClass();
            qrrVar.b.c.setVisibility(8);
            qrr qrrVar2 = this.a;
            qrrVar2.getClass();
            qrrVar2.F.c.setVisibility(0);
            mpe0 mpe0Var = ljs.a;
            qrr qrrVar3 = this.a;
            qrrVar3.getClass();
            ljs.d(qrrVar3.w, m0().b0.d());
        } else {
            qrrVar.getClass();
            qrrVar.b.c.setVisibility(0);
            qrr qrrVar4 = this.a;
            qrrVar4.getClass();
            qrrVar4.F.c.setVisibility(8);
            qrr qrrVar5 = this.a;
            qrrVar5.getClass();
            qrrVar5.w.setImageResource(R.drawable.icon_global_2);
            qrr qrrVar6 = this.a;
            qrrVar6.getClass();
            qrrVar6.w.setImageTintList(ColorStateList.valueOf(requireContext().getColor(R.color.icon_secondary)));
        }
        List<ChatMessage> listD = m0().O.d();
        if (listD != null) {
            r0(listD);
            ((Handler) this.E.getValue()).postDelayed(new Runnable() { // from class: jd7
                @Override // java.lang.Runnable
                public final void run() {
                    int itemCount;
                    td7 td7Var = this.a;
                    qrr qrrVar7 = td7Var.a;
                    qrrVar7.getClass();
                    RecyclerView.o layoutManager = qrrVar7.v.getLayoutManager();
                    if (layoutManager == null || (itemCount = td7Var.i.getItemCount() - 1) <= -1) {
                        return;
                    }
                    layoutManager.H0(itemCount);
                }
            }, 250L);
        }
    }
}
