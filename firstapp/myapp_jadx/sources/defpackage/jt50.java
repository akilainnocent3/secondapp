package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class jt50 extends BaseAdapter {
    public List<n6g0> a = new ArrayList();
    public final LayoutInflater b;
    public ss40 c;

    public static class a {
        public TextView a;
        public AppCompatCheckBox b;
        public TextView c;
    }

    public jt50(Context context) {
        this.b = LayoutInflater.from(context);
    }

    public final void b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n6g0 n6g0Var = (n6g0) obj;
            n6g0Var.a = arrayList2.contains(n6g0Var.c.id);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.a.size() <= 0 || i >= this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.b.inflate(R.layout.spr_expand_tab_pop_right_list_view_layout, viewGroup, false);
            aVar = new a();
            aVar.a = (TextView) view.findViewById(R.id.tv);
            aVar.c = (TextView) view.findViewById(R.id.count);
            aVar.b = (AppCompatCheckBox) view.findViewById(R.id.checkbox);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        n6g0 n6g0Var = (n6g0) getItem(i);
        aVar.a.setText(n6g0Var.c.name);
        TextView textView = aVar.c;
        int i2 = n6g0Var.c.eventSize;
        textView.setText(i2 != 0 ? String.valueOf(i2) : "");
        aVar.b.setChecked(n6g0Var.a);
        view.setOnClickListener(new View.OnClickListener() { // from class: it50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jt50 jt50Var = this.a;
                ss40 ss40Var = jt50Var.c;
                if (ss40Var != null) {
                    RegionsListView regionsListView = (RegionsListView) ss40Var.a;
                    int i3 = RegionsListView.C;
                    n6g0 n6g0Var2 = (n6g0) jt50Var.getItem(i);
                    if (n6g0Var2 == null) {
                        return;
                    }
                    boolean z = n6g0Var2.a;
                    int i4 = 0;
                    if (!z && regionsListView.i >= 20) {
                        zyf0.c(0, sn5.c(regionsListView, R.string.live__vnum_options_is_the_maximum_allowed, String.valueOf(20)));
                        return;
                    }
                    n6g0Var2.a = !z;
                    boolean z2 = n6g0Var2.b;
                    ArrayList arrayList = regionsListView.a;
                    if (z2) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            nt6 nt6Var = (nt6) obj;
                            for (Tournaments tournaments : nt6Var.b.tournaments) {
                                ArrayList arrayList2 = regionsListView.b;
                                int size2 = arrayList2.size();
                                int i6 = i4;
                                while (i6 < size2) {
                                    Object obj2 = arrayList2.get(i6);
                                    i6++;
                                    n6g0 n6g0Var3 = (n6g0) obj2;
                                    if (n6g0Var3.c.equals(tournaments)) {
                                        boolean z3 = n6g0Var2.a;
                                        Categories categories = nt6Var.b;
                                        if (z3) {
                                            String str = categories.id;
                                            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                                            if (TextUtils.equals(str, "sr:category:top")) {
                                                regionsListView.a(tournaments.id);
                                                nt6Var.a = nt6Var.b.tournaments.size() - 1;
                                            } else if (!n6g0Var3.a) {
                                                n6g0Var3.a = true;
                                                nt6Var.a++;
                                            }
                                        } else {
                                            String str2 = categories.id;
                                            AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = yrh0.a;
                                            if (TextUtils.equals(str2, "sr:category:top")) {
                                                regionsListView.b(tournaments.id);
                                            }
                                            int i7 = nt6Var.a;
                                            if (i7 > 0) {
                                                nt6Var.a = i7 - 1;
                                            }
                                            n6g0Var3.a = false;
                                        }
                                    }
                                    i4 = 0;
                                }
                            }
                        }
                    } else {
                        int size3 = arrayList.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj3 = arrayList.get(i8);
                            i8++;
                            nt6 nt6Var2 = (nt6) obj3;
                            Iterator<Tournaments> it = nt6Var2.b.tournaments.iterator();
                            while (it.hasNext()) {
                                if (n6g0Var2.c.equals(it.next())) {
                                    boolean z4 = n6g0Var2.a;
                                    int i9 = nt6Var2.a;
                                    if (z4) {
                                        nt6Var2.a = i9 + 1;
                                    } else if (i9 > 0) {
                                        nt6Var2.a = i9 - 1;
                                    }
                                }
                            }
                            String str3 = nt6Var2.b.id;
                            AccountHelperEntryPointImpl accountHelperEntryPointImpl3 = yrh0.a;
                            if (TextUtils.equals(str3, "sr:category:top")) {
                                boolean z5 = nt6Var2.a == nt6Var2.b.tournaments.size() - 1;
                                n6g0 n6g0Var4 = (n6g0) jt50Var.getItem(0);
                                if (n6g0Var4.b) {
                                    n6g0Var4.a = z5;
                                }
                                if (z5) {
                                    regionsListView.a("sr_select_item_id");
                                } else {
                                    regionsListView.b("sr_select_item_id");
                                }
                            }
                        }
                        boolean z6 = n6g0Var2.a;
                        Tournaments tournaments2 = n6g0Var2.c;
                        if (z6) {
                            regionsListView.a(tournaments2.id);
                        } else {
                            regionsListView.b(tournaments2.id);
                        }
                    }
                    regionsListView.e.notifyDataSetChanged();
                    regionsListView.d.notifyDataSetChanged();
                }
            }
        });
        return view;
    }
}
