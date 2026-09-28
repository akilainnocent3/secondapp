package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fm50 extends RecyclerView.f<e> {
    public final Context a;
    public List<jpc> b;
    public wk50 c;

    public class a extends e implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final ArrayList i;
        public final String[] v;

        /* JADX INFO: renamed from: fm50$a$a, reason: collision with other inner class name */
        public class C0572a implements PopupWindow.OnDismissListener {
            public final /* synthetic */ TextView a;

            /* JADX INFO: renamed from: fm50$a$a$a, reason: collision with other inner class name */
            public class RunnableC0573a implements Runnable {
                public RunnableC0573a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    aVar.e.setTag(Boolean.FALSE);
                    aVar.c(false);
                }
            }

            public C0572a(TextView textView) {
                this.a = textView;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.a.post(new RunnableC0573a());
            }
        }

        public a(View view) {
            super(view);
            this.i = new ArrayList();
            this.v = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th"};
            this.a = (TextView) view.findViewById(R.id.results_date);
            this.b = (TextView) view.findViewById(R.id.results_game_id);
            this.c = (TextView) view.findViewById(R.id.results_home_team);
            this.d = (TextView) view.findViewById(R.id.results_away_team);
            TextView textView = (TextView) view.findViewById(R.id.results_spinner);
            this.e = textView;
            this.f = (TextView) view.findViewById(R.id.results_time);
            textView.setOnClickListener(this);
            textView.setTag(Boolean.FALSE);
        }

        public static void b(int[] iArr, String str) {
            try {
                String[] strArrSplit = str.trim().split(":");
                if (strArrSplit.length == 2) {
                    iArr[0] = iArr[0] + Integer.parseInt(strArrSplit[0]);
                    iArr[1] = iArr[1] + Integer.parseInt(strArrSplit[1]);
                }
            } catch (Exception unused) {
                iArr[0] = -1;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // fm50.e
        public final void a(int i) {
            Event event;
            int iIntValue;
            int iIntValue2;
            Sport sport;
            String str;
            fm50 fm50Var = fm50.this;
            Context context = fm50Var.a;
            if (!(fm50Var.b.get(i) instanceof ing) || (event = ((ing) fm50Var.b.get(i)).a) == null) {
                return;
            }
            this.a.setText(bwf0.o(0, event.estimateStartTime, false));
            this.f.setText(bwf0.a.s(event.estimateStartTime, false));
            this.b.setText(b3.P(event));
            boolean zIsEmpty = TextUtils.isEmpty(event.setScore);
            TextView textView = this.c;
            TextView textView2 = this.d;
            if (!zIsEmpty) {
                try {
                    String[] strArrSplit = event.setScore.split(":");
                    if (strArrSplit.length == 2) {
                        String str2 = strArrSplit[0];
                        try {
                            Integer.parseInt(str2);
                            iIntValue = Integer.valueOf(str2).intValue();
                        } catch (NumberFormatException unused) {
                            iIntValue = 0;
                        }
                        String str3 = strArrSplit[1];
                        try {
                            Integer.parseInt(str3);
                            iIntValue2 = Integer.valueOf(str3).intValue();
                        } catch (NumberFormatException unused2) {
                            iIntValue2 = 0;
                        }
                        int iCompare = Integer.compare(iIntValue, iIntValue2);
                        if (iCompare > 0) {
                            textView.setTypeface(Typeface.DEFAULT_BOLD);
                            textView2.setTypeface(Typeface.DEFAULT);
                        } else if (iCompare < 0) {
                            textView.setTypeface(Typeface.DEFAULT);
                            textView2.setTypeface(Typeface.DEFAULT_BOLD);
                        } else {
                            Typeface typeface = Typeface.DEFAULT;
                            textView.setTypeface(typeface);
                            textView2.setTypeface(typeface);
                        }
                    }
                } catch (Exception unused3) {
                }
            }
            textView.setText(event.homeTeamName);
            textView2.setText(event.awayTeamName);
            int i2 = event.status;
            byte b = 5;
            TextView textView3 = this.e;
            if (i2 == 5) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setText(sn5.b(context, R.string.common_functions__cancelled, new Object[0]));
                Drawable drawableA = iwh0.a(textView3.getContext(), R.drawable.spr_ic_result_rectangle, Color.parseColor("#dcdee5"));
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                textView3.setBackground(drawableA);
                textView3.setTextColor(Color.parseColor("#9ca0ab"));
                textView3.setEnabled(false);
                return;
            }
            textView3.setText(event.setScore);
            Drawable drawableA2 = iwh0.a(textView3.getContext(), R.drawable.spr_ic_result_rectangle, Color.parseColor("#353a45"));
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            textView3.setBackground(drawableA2);
            ArrayList arrayList = this.i;
            arrayList.clear();
            List<String> list = event.regularTimeScore;
            if (list != null && list.size() > 0 && (sport = event.sport) != null && (str = sport.id) != null) {
                switch (str.hashCode()) {
                    case -715617392:
                        b = str.equals("sr:sport:1") ? (byte) 0 : (byte) -1;
                        break;
                    case -715617391:
                        b = str.equals("sr:sport:2") ? (byte) 1 : (byte) -1;
                        break;
                    case -715617389:
                        b = str.equals("sr:sport:4") ? (byte) 2 : (byte) -1;
                        break;
                    case -715617388:
                        b = str.equals("sr:sport:5") ? (byte) 3 : (byte) -1;
                        break;
                    case -715617387:
                        b = str.equals("sr:sport:6") ? (byte) 4 : (byte) -1;
                        break;
                    case -709302593:
                        if (!str.equals("sr:sport:20")) {
                            b = -1;
                        }
                        break;
                    case -709302590:
                        b = str.equals("sr:sport:23") ? (byte) 6 : (byte) -1;
                        break;
                    case -709302558:
                        b = str.equals("sr:sport:34") ? (byte) 7 : (byte) -1;
                        break;
                    case -513544716:
                        b = str.equals("sr:sport:137") ? (byte) 8 : (byte) -1;
                        break;
                    case -513544658:
                        b = str.equals("sr:sport:153") ? (byte) 9 : (byte) -1;
                        break;
                    case -513544531:
                        b = str.equals("sr:sport:196") ? (byte) 10 : (byte) -1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                String[] strArr = this.v;
                switch (b) {
                    case 0:
                    case 8:
                        wcb0 wcb0Var = new wcb0();
                        wcb0Var.a = sn5.b(context, R.string.app_common__half_prefix, String.valueOf(1));
                        wcb0Var.b = event.regularTimeScore.get(0);
                        arrayList.add(wcb0Var);
                        if (event.regularTimeScore.size() == 2 && !TextUtils.isEmpty(event.regularTimeScore.get(1))) {
                            wcb0 wcb0Var2 = new wcb0();
                            wcb0Var2.a = sn5.b(context, R.string.common_bet_ways__ft, new Object[0]);
                            int[] iArr = new int[2];
                            b(iArr, event.regularTimeScore.get(0));
                            b(iArr, event.regularTimeScore.get(1));
                            wcb0Var2.b = sn5.b(context, R.string.app_common__colon_placeholder, String.valueOf(iArr[0]), String.valueOf(iArr[1]));
                            arrayList.add(wcb0Var2);
                        }
                        break;
                    case 1:
                    case 9:
                        boolean z = event.regularTimeScore.size() == 2;
                        for (int i3 = 1; i3 <= event.regularTimeScore.size(); i3++) {
                            wcb0 wcb0Var3 = new wcb0();
                            wcb0Var3.a = sn5.b(context, z ? R.string.app_common__half_prefix : R.string.app_common__quarter, Integer.valueOf(i3));
                            wcb0Var3.b = event.regularTimeScore.get(i3 - 1);
                            arrayList.add(wcb0Var3);
                        }
                        break;
                    case 2:
                        wcb0 wcb0Var4 = new wcb0();
                        wcb0Var4.a = sn5.b(context, R.string.app_common__period_suffix, strArr[0]);
                        wcb0Var4.b = event.regularTimeScore.get(0);
                        arrayList.add(wcb0Var4);
                        if (event.regularTimeScore.size() >= 2) {
                            int[] iArr2 = new int[2];
                            b(iArr2, event.regularTimeScore.get(0));
                            b(iArr2, event.regularTimeScore.get(1));
                            if (iArr2[0] != -1) {
                                wcb0 wcb0Var5 = new wcb0();
                                wcb0Var5.a = sn5.b(context, R.string.app_common__period_suffix, strArr[1]);
                                wcb0Var5.b = sn5.b(context, R.string.app_common__colon_placeholder, String.valueOf(iArr2[0]), String.valueOf(iArr2[1]));
                                arrayList.add(wcb0Var5);
                            }
                            if (event.regularTimeScore.size() >= 3) {
                                for (int i4 = 3; i4 <= event.regularTimeScore.size(); i4++) {
                                    b(iArr2, event.regularTimeScore.get(i4 - 1));
                                }
                                if (iArr2[0] != -1) {
                                    wcb0 wcb0Var6 = new wcb0();
                                    wcb0Var6.a = sn5.b(context, R.string.common_bet_ways__ft, new Object[0]);
                                    wcb0Var6.b = sn5.b(context, R.string.app_common__colon_placeholder, String.valueOf(iArr2[0]), String.valueOf(iArr2[1]));
                                    arrayList.add(wcb0Var6);
                                }
                            }
                        }
                        break;
                    case 3:
                    case 5:
                    case 10:
                        for (int i5 = 1; i5 <= event.regularTimeScore.size(); i5++) {
                            wcb0 wcb0Var7 = new wcb0();
                            wcb0Var7.a = sn5.b(context, R.string.app_common__set_prefix, String.valueOf(i5));
                            wcb0Var7.b = event.regularTimeScore.get(i5 - 1);
                            arrayList.add(wcb0Var7);
                        }
                        break;
                    case 4:
                        wcb0 wcb0Var8 = new wcb0();
                        wcb0Var8.a = sn5.b(context, R.string.common_functions__half_suffix, strArr[0]);
                        wcb0Var8.b = event.regularTimeScore.get(0);
                        arrayList.add(wcb0Var8);
                        if (event.regularTimeScore.size() >= 2) {
                            int[] iArr3 = new int[2];
                            b(iArr3, event.regularTimeScore.get(0));
                            for (int i6 = 2; i6 <= event.regularTimeScore.size(); i6++) {
                                b(iArr3, event.regularTimeScore.get(i6 - 1));
                            }
                            if (iArr3[0] != -1) {
                                wcb0 wcb0Var9 = new wcb0();
                                wcb0Var9.a = sn5.b(context, R.string.common_bet_ways__ft, new Object[0]);
                                wcb0Var9.b = sn5.b(context, R.string.app_common__colon_placeholder, String.valueOf(iArr3[0]), String.valueOf(iArr3[1]));
                                arrayList.add(wcb0Var9);
                            }
                        }
                        break;
                    case 6:
                    case 7:
                        for (int i7 = 1; i7 <= event.regularTimeScore.size() && i7 <= strArr.length; i7++) {
                            wcb0 wcb0Var10 = new wcb0();
                            int i8 = i7 - 1;
                            wcb0Var10.a = sn5.b(context, R.string.app_common__set_suffix, strArr[i8]);
                            wcb0Var10.b = event.regularTimeScore.get(i8);
                            arrayList.add(wcb0Var10);
                        }
                        break;
                }
                if (!TextUtils.isEmpty(event.overTimeScore)) {
                    wcb0 wcb0Var11 = new wcb0();
                    wcb0Var11.a = sn5.b(context, R.string.common_bet_ways__ot, new Object[0]);
                    wcb0Var11.b = event.overTimeScore;
                    arrayList.add(wcb0Var11);
                }
            }
            if (arrayList.size() <= 0) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView3.setEnabled(true);
                c(false);
            }
        }

        public final void c(boolean z) {
            TextView textView = this.e;
            Drawable drawableA = iwh0.a(textView.getContext(), z ? R.drawable.spr_ic_keyboard_arrow_up_black_24dp : R.drawable.spr_ic_keyboard_arrow_down_black_24dp, -1);
            drawableA.setAlpha(255);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = fm50.this.a;
            if (view instanceof TextView) {
                ArrayList arrayList = this.i;
                if (arrayList.size() > 0) {
                    ycb0 ycb0Var = new ycb0(context);
                    LayoutInflater.from(context).inflate(R.layout.spr_results_spinner_list, ycb0Var);
                    RecyclerView recyclerView = (RecyclerView) ycb0Var.findViewById(R.id.spinner_recycler_view);
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    xcb0 xcb0Var = new xcb0();
                    xcb0Var.a = arrayList;
                    recyclerView.setAdapter(xcb0Var);
                    PopupWindow popupWindow = new PopupWindow((View) ycb0Var, -2, -2, true);
                    TextView textView = this.e;
                    boolean z = !((Boolean) textView.getTag()).booleanValue();
                    c(z);
                    textView.setTag(Boolean.valueOf(z));
                    popupWindow.setBackgroundDrawable(gr0.a(context, R.drawable.spr_spinner_bg));
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    view.getLocationOnScreen(iArr2);
                    int height = view.getHeight();
                    int width = view.getWidth();
                    int i = view.getContext().getResources().getDisplayMetrics().heightPixels;
                    ycb0Var.measure(0, 0);
                    int measuredHeight = ycb0Var.getMeasuredHeight();
                    int measuredWidth = ycb0Var.getMeasuredWidth();
                    int i2 = iArr2[1];
                    if ((i - i2) - height < measuredHeight) {
                        iArr[0] = (width / 2) + (iArr2[0] - (measuredWidth / 2));
                        iArr[1] = (i2 - measuredHeight) - 10;
                    } else {
                        iArr[0] = (width / 2) + (iArr2[0] - (measuredWidth / 2));
                        iArr[1] = i2 + height + 10;
                    }
                    popupWindow.showAtLocation(view, 8388659, iArr[0], iArr[1]);
                    popupWindow.setOnDismissListener(new C0572a((TextView) view));
                }
            }
        }
    }

    public class b extends e {
        public final ProgressBar a;
        public final TextView b;
        public bxs c;
        public final z7h d;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                bxs bxsVar = bVar.c;
                if (bxsVar == null || !bxsVar.a) {
                    return;
                }
                bVar.b();
            }
        }

        public b(View view) {
            super(view);
            this.d = ap0.b();
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.results_loading_progress);
            this.a = progressBar;
            progressBar.getIndeterminateDrawable().setColorFilter(view.getContext().getColor(R.color.text_type2_tertiary), PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view.findViewById(R.id.results_load_more);
            this.b = textView;
            textView.setOnClickListener(new a());
        }

        @Override // fm50.e
        public final void a(int i) {
            fm50 fm50Var = fm50.this;
            if (fm50Var.b.get(i) instanceof bxs) {
                this.c = (bxs) fm50Var.b.get(i);
                b();
            }
        }

        public final void b() {
            boolean z = this.c.a;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(sn5.b(fm50.this.a, R.string.common_feedback__no_more_records, new Object[0]));
                return;
            }
            progressBar.setVisibility(0);
            textView.setVisibility(8);
            bxs bxsVar = this.c;
            if (bxsVar.b == null) {
                bxsVar.b = this.d.p(bxsVar.c, bxsVar.d, bxsVar.e, bxsVar.v, bxsVar.i, bxsVar.f, "20");
                this.c.b.G(new gm50(this));
            }
        }
    }

    public abstract class e extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    public fm50(Context context, m2g m2gVar) {
        this.a = context;
        this.b = m2gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.b.get(i).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((e) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new d(layoutInflaterFrom.inflate(R.layout.spr_results_tournament_title_item, viewGroup, false));
        }
        if (i == 2) {
            return new a(layoutInflaterFrom.inflate(R.layout.spr_results_event_item, viewGroup, false));
        }
        if (i == 3) {
            return new c(layoutInflaterFrom.inflate(R.layout.spr_results_event_title_item, viewGroup, false));
        }
        if (i != 6) {
            return null;
        }
        return new b(layoutInflaterFrom.inflate(R.layout.spr_results_load_more_item, viewGroup, false));
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class d extends e implements View.OnClickListener {
        public final TextView a;
        public c6g0 b;

        public d(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.results_tournament_title);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // fm50.e
        public final void a(int i) {
            fm50 fm50Var = fm50.this;
            if (fm50Var.b.get(i) instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) fm50Var.b.get(i);
                this.b = c6g0Var;
                String str = c6g0Var.b;
                TextView textView = this.a;
                textView.setText(str);
                textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(textView.getContext(), this.b.d ? R.drawable.spr_ic_arrow_down_16_16dp : R.drawable.spr_ic_arrow_right_16_16dp), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            wk50 wk50Var;
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            c6g0 c6g0Var = this.b;
            boolean z = c6g0Var.d;
            List<ing> list = c6g0Var.f;
            int size = 0;
            fm50 fm50Var = fm50.this;
            if (!z) {
                if (list != null) {
                    size = list.size();
                }
                c6g0 c6g0Var2 = this.b;
                if (!c6g0Var2.e) {
                    int i = absoluteAdapterPosition + 1;
                    fm50Var.b.addAll(i, c6g0Var2.f);
                    this.b.e = true;
                    fm50Var.notifyItemRangeInserted(i, size);
                }
                if (absoluteAdapterPosition <= fm50Var.b.size() - 2 && (wk50Var = fm50Var.c) != null) {
                    int iMin = Math.min(size, 3) + absoluteAdapterPosition;
                    dgd0 dgd0Var = wk50Var.a.d;
                    if (dgd0Var != null) {
                        dgd0Var.y.s0(iMin);
                    } else {
                        Intrinsics.n(tYcQsJyaojE.dtRuHQ);
                        throw null;
                    }
                }
            } else if (list != null) {
                int size2 = list.size();
                if (this.b.e && fm50Var.b.size() > absoluteAdapterPosition + size2 + 1) {
                    for (int i2 = 0; i2 < size2; i2++) {
                        fm50Var.b.remove(absoluteAdapterPosition + 1);
                    }
                    this.b.e = false;
                    fm50Var.notifyItemRangeRemoved(absoluteAdapterPosition + 1, size2);
                }
            }
            c6g0 c6g0Var3 = this.b;
            c6g0Var3.d = !c6g0Var3.d;
            fm50Var.notifyItemChanged(absoluteAdapterPosition);
            fm50Var.notifyDataSetChanged();
        }
    }

    public class c extends e {
        @Override // fm50.e
        public final void a(int i) {
        }
    }
}
