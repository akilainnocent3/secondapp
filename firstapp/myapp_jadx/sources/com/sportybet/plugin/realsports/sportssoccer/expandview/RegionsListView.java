package com.sportybet.plugin.realsports.sportssoccer.expandview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.sporty.android.book.domain.entity.Category;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Tournaments;
import defpackage.f00;
import defpackage.j4s;
import defpackage.jt50;
import defpackage.n6g0;
import defpackage.nt6;
import defpackage.rs40;
import defpackage.sn5;
import defpackage.ss40;
import defpackage.vgb0;
import defpackage.yrh0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class RegionsListView extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public View A;
    public boolean B;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public jt50 d;
    public j4s e;
    public int f;
    public int i;
    public TextView v;
    public final ArrayList w;
    public a y;
    public View z;

    public interface a {
        void a(String str, boolean z);
    }

    public RegionsListView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = 0;
        this.i = rs40.b().c().size();
        this.w = new ArrayList();
        c(context);
    }

    public final void a(String str) {
        ArrayList arrayList = this.w;
        if (arrayList.contains(str) || TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.equals(str, "sr_select_item_id")) {
            this.i++;
        }
        arrayList.add(str);
    }

    public final void b(String str) {
        if (!TextUtils.equals(str, "sr_select_item_id")) {
            this.i--;
        }
        ArrayList arrayList = this.w;
        int i = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (TextUtils.equals(str, (String) arrayList.get(size))) {
                arrayList.remove(size);
                i++;
            }
            if (i == 2) {
                return;
            }
        }
    }

    public final void c(Context context) {
        this.A = LayoutInflater.from(context).inflate(R.layout.spr_sports_regions_layout, (ViewGroup) this, true);
        this.v = (TextView) findViewById(R.id.no_info_tip_text);
        this.z = findViewById(R.id.regions_layout);
        ListView listView = (ListView) findViewById(R.id.parent_listView);
        ListView listView2 = (ListView) findViewById(R.id.child_listView);
        findViewById(R.id.apply_button).setOnClickListener(this);
        findViewById(R.id.reset_button).setOnClickListener(this);
        j4s j4sVar = new j4s(context);
        this.e = j4sVar;
        listView.setAdapter((ListAdapter) j4sVar);
        this.e.c = new ss40(this);
        jt50 jt50Var = new jt50(context);
        this.d = jt50Var;
        listView2.setAdapter((ListAdapter) jt50Var);
        this.d.c = new ss40(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    public final void d(List<Categories> list) {
        boolean z;
        ?? r14;
        boolean z2 = false;
        this.i = 0;
        this.f = 0;
        this.e.d = -1;
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        ArrayList arrayList3 = this.w;
        arrayList3.clear();
        arrayList3.addAll(rs40.b().c());
        int i = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i >= list.size()) {
                break;
            }
            Categories categories = list.get(i);
            if (categories != null && categories.tournaments != null) {
                nt6 nt6Var = new nt6();
                nt6Var.b = categories;
                int i2 = 0;
                for (Tournaments tournaments : categories.tournaments) {
                    if (arrayList3.contains(tournaments.id) && !TextUtils.equals(tournaments.id, "sr_select_item_id")) {
                        if (!z3) {
                            if (this.f != i) {
                                this.f = i;
                            }
                            z3 = true;
                        }
                        i2++;
                    }
                }
                nt6Var.a = i2;
                arrayList.add(nt6Var);
            }
            i++;
        }
        this.i = rs40.b().c().size();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            nt6 nt6Var2 = (nt6) obj;
            ArrayList arrayList4 = new ArrayList();
            Categories categories2 = nt6Var2.b;
            if (categories2 != null && categories2.tournaments != null) {
                String str = categories2.id;
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                if (TextUtils.equals(str, "sr:category:top")) {
                    boolean z4 = nt6Var2.a == nt6Var2.b.tournaments.size() ? z : false;
                    int i4 = nt6Var2.b.eventSize;
                    n6g0 n6g0Var = new n6g0();
                    Tournaments tournaments2 = new Tournaments();
                    n6g0Var.c = tournaments2;
                    n6g0Var.a = z4;
                    n6g0Var.b = z;
                    tournaments2.id = "sr_select_item_id";
                    tournaments2.name = sn5.c(this, R.string.common_functions__all, new Object[0]);
                    Tournaments tournaments3 = n6g0Var.c;
                    tournaments3.eventSize = i4;
                    if (!nt6Var2.b.tournaments.contains(tournaments3)) {
                        nt6Var2.b.tournaments.add(0, tournaments3);
                    }
                }
                for (Tournaments tournaments4 : nt6Var2.b.tournaments) {
                    n6g0 n6g0Var2 = new n6g0();
                    n6g0Var2.c = tournaments4;
                    if (arrayList3.contains(tournaments4.id)) {
                        r14 = 1;
                        n6g0Var2.a = true;
                    } else {
                        r14 = 1;
                    }
                    if (TextUtils.equals(tournaments4.id, "sr_select_item_id")) {
                        boolean z5 = nt6Var2.a == nt6Var2.b.tournaments.size() - r14 ? r14 : 0;
                        n6g0Var2.b = r14;
                        n6g0Var2.a = z5;
                        if (z5 != 0) {
                            arrayList3.add("sr_select_item_id");
                        } else {
                            arrayList3.remove("sr_select_item_id");
                        }
                    }
                    arrayList4.add(n6g0Var2);
                }
                arrayList2.add(arrayList4);
                z = true;
            }
        }
        boolean z6 = z;
        this.v.setVisibility(list.size() == 0 ? 0 : 8);
        this.z.setVisibility(list.size() != 0 ? 0 : 8);
        this.e.a = arrayList;
        ArrayList arrayList5 = this.b;
        arrayList5.clear();
        Iterator<Categories> it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().id, Category.FAVOURITES_ID)) {
                z2 = z6;
                break;
            }
        }
        if (this.f < arrayList.size()) {
            int i5 = this.f;
            if (z2 && i5 == 0) {
                i5++;
            }
            arrayList5.addAll((Collection) arrayList2.get(i5));
            this.d.b(arrayList5, arrayList3);
            this.e.d = i5;
        }
        this.e.notifyDataSetChanged();
        this.d.notifyDataSetChanged();
    }

    public String getRegionsName() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nt6 nt6Var = (nt6) obj;
            if (nt6Var.a > 0) {
                return nt6Var.b.name;
            }
        }
        return sn5.c(this, R.string.common_functions__league, new Object[0]);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        ArrayList arrayList = this.w;
        int i = 0;
        if (id != R.id.reset_button) {
            if (id == R.id.apply_button) {
                f00 f00Var = vgb0.a;
                vgb0.a("Sports_Apply");
                if (this.y != null) {
                    rs40.b().a();
                    rs40 rs40VarB = rs40.b();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        String str = (String) obj;
                        rs40VarB.a.put(str, str);
                    }
                    this.y.a(getRegionsName(), this.B);
                    return;
                }
                return;
            }
            return;
        }
        this.B = true;
        arrayList.clear();
        this.i = 0;
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            nt6 nt6Var = (nt6) obj2;
            nt6Var.getClass();
            nt6Var.a = 0;
        }
        ArrayList arrayList3 = this.c;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            Iterator it = ((List) obj3).iterator();
            while (it.hasNext()) {
                ((n6g0) it.next()).a = false;
            }
        }
        this.e.notifyDataSetChanged();
        this.d.notifyDataSetChanged();
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.A.setOnClickListener(onClickListener);
    }

    public void setOnApplyClickListener(a aVar) {
        this.y = aVar;
    }

    public RegionsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = 0;
        this.i = rs40.b().c().size();
        this.w = new ArrayList();
        c(context);
    }
}
