package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wj50 extends RecyclerView.f<c> {
    public ArrayList a;
    public ej50 b;
    public z680 c;
    public Context d;
    public String e;

    public class a extends c implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public xm50 c;
        public final int d;
        public final int e;
        public final int f;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.results_title_name);
            this.a = textView;
            this.b = (TextView) view.findViewById(R.id.results_no_data);
            textView.setOnClickListener(this);
            this.d = view.getContext().getColor(R.color.brand_quaternary);
            this.e = view.getContext().getColor(R.color.text_type2_tertiary);
            this.f = view.getContext().getColor(R.color.brand_secondary_disable);
        }

        @Override // wj50.c
        public final void a(int i) {
            wj50 wj50Var = wj50.this;
            Context context = wj50Var.d;
            if (wj50Var.a.get(i) instanceof xm50) {
                xm50 xm50Var = (xm50) wj50Var.a.get(i);
                this.c = xm50Var;
                String str = xm50Var.a;
                TextView textView = this.a;
                textView.setText(str);
                int i2 = this.c.c ? R.drawable.spr_ic_keyboard_arrow_up_black_24dp : R.drawable.spr_ic_keyboard_arrow_down_black_24dp;
                Context context2 = textView.getContext();
                int i3 = this.e;
                Drawable drawableA = iwh0.a(context2, i2, i3);
                int i4 = this.c.b;
                int i5 = this.d;
                TextView textView2 = this.b;
                if (i4 == 0) {
                    textView.setEnabled(true);
                    textView.setTextColor(i5);
                    textView2.setText(sn5.b(context, R.string.common_feedback__no_countries_available, new Object[0]));
                } else if (i4 == 1) {
                    textView.setEnabled(true);
                    if (!TextUtils.isEmpty(wj50Var.c.c)) {
                        i3 = i5;
                    }
                    textView.setTextColor(i3);
                    textView2.setText(sn5.b(context, R.string.common_feedback__no_categories_available, new Object[0]));
                } else if (i4 == 2) {
                    boolean zIsEmpty = TextUtils.isEmpty(wj50Var.c.c);
                    textView.setEnabled(!zIsEmpty);
                    if (TextUtils.isEmpty(wj50Var.c.e)) {
                        i5 = i3;
                    }
                    int i6 = this.f;
                    if (zIsEmpty) {
                        i5 = i6;
                    }
                    textView.setTextColor(i5);
                    Context context3 = textView.getContext();
                    if (zIsEmpty) {
                        i3 = i6;
                    }
                    drawableA = iwh0.a(context3, i2, i3);
                    textView2.setText(sn5.b(context, R.string.common_feedback__no_leagues_available, new Object[0]));
                }
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
                textView.setTag(Integer.valueOf(i));
                textView2.setVisibility(this.c.v ? 0 : 8);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                boolean z = this.c.c;
                wj50 wj50Var = wj50.this;
                if (!z) {
                    wj50Var.j(false);
                }
                int adapterPosition = getAdapterPosition();
                List<dl50> listI = wj50Var.i(this.c);
                if (this.c.c) {
                    if (listI != null) {
                        int size = listI.size();
                        if (this.c.d) {
                            for (int i = 0; i < size; i++) {
                                wj50Var.a.remove(adapterPosition + 1);
                            }
                            this.c.d = false;
                            wj50Var.notifyItemRangeRemoved(adapterPosition + 1, size);
                        }
                    }
                    this.c.v = false;
                } else {
                    int size2 = listI != null ? listI.size() : 0;
                    xm50 xm50Var = this.c;
                    if (size2 == 0) {
                        xm50Var.v = true;
                    } else if (!xm50Var.d) {
                        int i2 = adapterPosition + 1;
                        wj50Var.a.addAll(i2, listI);
                        this.c.d = true;
                        wj50Var.notifyItemRangeInserted(i2, listI.size());
                    }
                }
                xm50 xm50Var2 = this.c;
                xm50Var2.c = !xm50Var2.c;
                wj50Var.notifyItemChanged(adapterPosition);
            }
        }
    }

    public class b extends c implements View.OnClickListener {
        public final TextView a;
        public dl50 b;
        public final int c;
        public final int d;

        public b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.results_event_text);
            this.a = textView;
            textView.setOnClickListener(this);
            this.c = view.getContext().getColor(R.color.brand_quaternary);
            this.d = view.getContext().getColor(R.color.text_type2_tertiary);
        }

        @Override // wj50.c
        public final void a(int i) {
            wj50 wj50Var = wj50.this;
            if (wj50Var.a.get(i) instanceof dl50) {
                dl50 dl50Var = (dl50) wj50Var.a.get(i);
                this.b = dl50Var;
                String str = dl50Var.b;
                TextView textView = this.a;
                textView.setText(str);
                dl50 dl50Var2 = this.b;
                int i2 = dl50Var2.c;
                int i3 = this.d;
                int i4 = this.c;
                if (i2 == 0) {
                    if (TextUtils.equals(dl50Var2.a, wj50Var.c.a)) {
                        i3 = i4;
                    }
                    textView.setTextColor(i3);
                } else if (i2 == 1) {
                    if (TextUtils.equals(dl50Var2.a, wj50Var.c.c)) {
                        i3 = i4;
                    }
                    textView.setTextColor(i3);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    if (TextUtils.equals(dl50Var2.a, wj50Var.c.e)) {
                        i3 = i4;
                    }
                    textView.setTextColor(i3);
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            wj50 wj50Var = wj50.this;
            Context context = wj50Var.d;
            if (view instanceof TextView) {
                jpc jpcVar = (jpc) wj50Var.a.get(this.b.c);
                if (jpcVar instanceof xm50) {
                    xm50 xm50Var = (xm50) jpcVar;
                    dl50 dl50Var = this.b;
                    String str = dl50Var.b;
                    xm50Var.a = str;
                    String str2 = dl50Var.a;
                    int i = dl50Var.c;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                z680 z680Var = wj50Var.c;
                                z680Var.e = str2;
                                z680Var.f = str;
                            }
                        } else if (!TextUtils.equals(wj50Var.c.c, str2)) {
                            z680 z680Var2 = wj50Var.c;
                            dl50 dl50Var2 = this.b;
                            z680Var2.c = dl50Var2.a;
                            z680Var2.e = null;
                            z680Var2.d = dl50Var2.b;
                            z680Var2.f = null;
                            ((xm50) rh6.a(1, wj50Var.a)).a = sn5.b(context, R.string.common_functions__select_tournament, new Object[0]);
                            wj50Var.notifyItemChanged(wj50Var.a.size() - 1);
                        }
                    } else if (!TextUtils.equals(wj50Var.c.a, str2)) {
                        z680 z680Var3 = wj50Var.c;
                        dl50 dl50Var3 = this.b;
                        z680Var3.a = dl50Var3.a;
                        z680Var3.c = null;
                        z680Var3.e = null;
                        z680Var3.b = dl50Var3.b;
                        z680Var3.d = null;
                        z680Var3.f = null;
                        ((xm50) rh6.a(2, wj50Var.a)).a = sn5.b(context, R.string.common_functions__select_category, new Object[0]);
                        xm50 xm50Var2 = (xm50) rh6.a(1, wj50Var.a);
                        xm50Var2.getClass();
                        xm50Var2.a = sn5.b(context, R.string.common_functions__select_tournament, new Object[0]);
                        wj50Var.notifyItemChanged(wj50Var.a.size() - 2);
                        wj50Var.notifyItemChanged(wj50Var.a.size() - 1);
                    }
                    int i2 = this.b.c;
                    if (wj50Var.a.get(i2) instanceof xm50) {
                        List<dl50> listI = wj50Var.i(xm50Var);
                        int size = listI == null ? 0 : listI.size();
                        if (xm50Var.d) {
                            for (int i3 = 0; i3 < size; i3++) {
                                wj50Var.a.remove(i2 + 1);
                            }
                            xm50Var.d = false;
                            wj50Var.notifyItemRangeRemoved(i2 + 1, size);
                        }
                    }
                    xm50Var.c = !xm50Var.c;
                    wj50Var.notifyItemChanged(i2);
                }
                ej50 ej50Var = wj50Var.b;
                if (ej50Var != null) {
                    z680 z680Var4 = wj50Var.c;
                    ResultChangeLeaguePanel resultChangeLeaguePanel = ej50Var.a;
                    int i4 = ResultChangeLeaguePanel.E;
                    z680Var4.getClass();
                    resultChangeLeaguePanel.post(new gj50(resultChangeLeaguePanel, z680Var4));
                    resultChangeLeaguePanel.C = (z680) z680Var4.clone();
                }
            }
        }
    }

    public abstract class c extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((jpc) this.a.get(i)).a();
    }

    public final List<dl50> i(xm50 xm50Var) {
        int i = xm50Var.b;
        if (i == 0) {
            return xm50Var.b(this.c.a);
        }
        if (i == 1) {
            return xm50Var.b(this.c.a);
        }
        if (i != 2) {
            return null;
        }
        return xm50Var.b(this.c.c);
    }

    public final void j(boolean z) {
        String str = this.e;
        Context context = this.d;
        xm50 xm50Var = (xm50) this.a.get(0);
        if (z && xm50Var.c) {
            xm50Var.a = str;
            ((xm50) rh6.a(2, this.a)).a = sn5.b(context, R.string.common_functions__select_category, new Object[0]);
            ((xm50) rh6.a(1, this.a)).a = sn5.b(context, R.string.common_functions__select_tournament, new Object[0]);
            notifyItemChanged(0);
            notifyItemChanged(this.a.size() - 2);
            notifyItemChanged(this.a.size() - 1);
        }
        if (xm50Var.c) {
            k(xm50Var, 0);
            k(xm50Var, 0);
            return;
        }
        xm50 xm50Var2 = (xm50) this.a.get(1);
        if (z && xm50Var2.c) {
            xm50Var.a = str;
            xm50Var2.a = sn5.b(context, R.string.common_functions__select_category, new Object[0]);
            ((xm50) rh6.a(1, this.a)).a = sn5.b(context, R.string.common_functions__select_tournament, new Object[0]);
            notifyItemChanged(0);
            notifyItemChanged(1);
            notifyItemChanged(this.a.size() - 1);
        }
        if (xm50Var2.c) {
            k(xm50Var2, 1);
            return;
        }
        xm50 xm50Var3 = (xm50) this.a.get(2);
        if (z) {
            xm50Var.a = str;
            xm50Var2.a = sn5.b(context, R.string.common_functions__select_category, new Object[0]);
            xm50Var3.a = sn5.b(context, R.string.common_functions__select_tournament, new Object[0]);
            notifyItemChanged(0);
            notifyItemChanged(1);
            notifyItemChanged(2);
        }
        if (xm50Var3.c) {
            k(xm50Var3, 2);
        }
    }

    public final void k(xm50 xm50Var, int i) {
        if (this.a.get(i) instanceof xm50) {
            List<dl50> listI = i(xm50Var);
            int size = listI == null ? 0 : listI.size();
            if (xm50Var.d) {
                for (int i2 = 0; i2 < size; i2++) {
                    this.a.remove(i + 1);
                }
                xm50Var.d = false;
                notifyItemRangeRemoved(i + 1, size);
            }
            xm50Var.c = false;
            xm50Var.v = false;
            notifyItemChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((c) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new a(layoutInflaterFrom.inflate(R.layout.spr_results_options_title_item, viewGroup, false));
        }
        if (i == 1) {
            return new b(layoutInflaterFrom.inflate(R.layout.spr_results_options_event_item, viewGroup, false));
        }
        eub.a("ResultOptionRecyclerAdapter viewHolder return null,type:" + i);
        return null;
    }
}
