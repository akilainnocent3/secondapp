package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import com.sportybet.plugin.realsports.betorder.calendar.view.customviews.CircleAnimationTextView;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class czc extends RecyclerView.f<RecyclerView.d0> {
    public u4w a;
    public azc b;
    public wyc c;
    public n3z d;
    public CalendarView e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        u4w u4wVar = this.a;
        if (u4wVar == null) {
            return 0;
        }
        return u4wVar.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        return ((uyc) this.a.a.get(i)).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        if (i >= 7 || !this.e.w.a.x) {
            return ((uyc) this.a.a.get(i)).b ? 1 : 2;
        }
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        int dayTextColor;
        boolean z;
        final uyc uycVar = (uyc) this.a.a.get(i);
        int itemViewType = d0Var.getItemViewType();
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                o3z o3zVar = (o3z) d0Var;
                this.d.getClass();
                o3zVar.a.setText(String.valueOf(uycVar.a.get(5)));
                o3zVar.a.setTextColor(o3zVar.b.getOtherDayTextColor());
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            bzc bzcVar = (bzc) d0Var;
            this.b.getClass();
            bzcVar.a.setText(Character.toString(bzcVar.c.format(uycVar.a.getTime()).charAt(0)));
            bzcVar.a.setTextColor(bzcVar.b.getWeekDayTitleTextColor());
            return;
        }
        final wyc wycVar = this.c;
        yyc yycVar = (yyc) d0Var;
        final y52 y52Var = wycVar.b.d;
        CalendarView calendarView = yycVar.b;
        yycVar.d = y52Var;
        CircleAnimationTextView circleAnimationTextView = yycVar.c;
        circleAnimationTextView.setText(String.valueOf(uycVar.a.get(5)));
        boolean zC = y52Var.c(uycVar);
        if (!zC || (z = uycVar.d)) {
            if (uycVar.f) {
                yycVar.a(false);
                dayTextColor = 0;
            } else if (uycVar.e) {
                dayTextColor = calendarView.getWeekendDayTextColor();
                circleAnimationTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                dayTextColor = calendarView.getDayTextColor();
                circleAnimationTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            uycVar.h = false;
            circleAnimationTextView.setTextColor(dayTextColor);
            if (circleAnimationTextView.v != null) {
                circleAnimationTextView.z = true;
                circleAnimationTextView.invalidate();
            }
        } else {
            if (uycVar.f) {
                if (z) {
                    circleAnimationTextView.setTextColor(0);
                } else {
                    circleAnimationTextView.setTextColor(0);
                }
                yycVar.a(true);
            } else {
                circleAnimationTextView.setTextColor(calendarView.getSelectedDayTextColor());
                circleAnimationTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            l980 l980VarB = yycVar.d.b(uycVar);
            l980 l980Var = uycVar.g;
            l980 l980Var2 = l980.c;
            l980 l980Var3 = l980.b;
            l980 l980Var4 = l980.e;
            if (l980Var != l980VarB) {
                boolean z2 = uycVar.h;
                if (z2 && l980VarB == l980Var4) {
                    circleAnimationTextView.g();
                    circleAnimationTextView.v = l980Var4;
                    circleAnimationTextView.i(calendarView.getSelectedDayBackgroundColor());
                } else if (z2 && l980VarB == l980Var3) {
                    circleAnimationTextView.w = calendarView;
                    circleAnimationTextView.v = l980Var3;
                    circleAnimationTextView.i(calendarView.getSelectedDayBackgroundStartColor());
                } else if (z2 && l980VarB == l980Var2) {
                    circleAnimationTextView.w = calendarView;
                    circleAnimationTextView.v = l980Var2;
                    circleAnimationTextView.i(calendarView.getSelectedDayBackgroundEndColor());
                } else {
                    circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                }
            } else {
                int iOrdinal = l980VarB.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                            } else if (iOrdinal == 4) {
                                if (uycVar.h) {
                                    circleAnimationTextView.g();
                                    circleAnimationTextView.v = l980Var4;
                                    circleAnimationTextView.i(calendarView.getSelectedDayBackgroundColor());
                                } else {
                                    circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                                }
                            }
                        } else if (uycVar.h) {
                            circleAnimationTextView.w = calendarView;
                            circleAnimationTextView.v = l980Var2;
                            circleAnimationTextView.i(calendarView.getSelectedDayBackgroundEndColor());
                        } else {
                            circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                        }
                    } else if (uycVar.h) {
                        circleAnimationTextView.w = calendarView;
                        circleAnimationTextView.v = l980Var3;
                        circleAnimationTextView.i(calendarView.getSelectedDayBackgroundStartColor());
                    } else {
                        circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                    }
                } else if (uycVar.h) {
                    circleAnimationTextView.w = calendarView;
                    circleAnimationTextView.v = l980.a;
                    circleAnimationTextView.i(calendarView.getSelectedDayBackgroundStartColor());
                } else {
                    circleAnimationTextView.setSelectionStateAndAnimate(l980VarB, calendarView, uycVar);
                }
            }
        }
        if (uycVar.c) {
            View view = yycVar.itemView;
            Drawable drawableA = iwh0.a(yycVar.itemView.getContext(), zC ? calendarView.getCurrentDaySelectedIconRes() : calendarView.getCurrentDayIconRes(), zC ? view.getContext().getColor(R.color.brand_tertiary) : view.getContext().getColor(R.color.brand_secondary));
            circleAnimationTextView.setCompoundDrawablePadding(((int) ((zC ? lu5.d(calendarView.getContext().getResources(), calendarView.getCurrentDaySelectedIconRes()) : lu5.d(calendarView.getContext().getResources(), calendarView.getCurrentDayIconRes())) * Resources.getSystem().getDisplayMetrics().density)) * (-1));
            circleAnimationTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawableA, (Drawable) null, (Drawable) null);
        }
        if (uycVar.d) {
            circleAnimationTextView.setTextColor(calendarView.getDisabledDayTextColor());
        }
        yycVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: vyc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                wyc wycVar2 = wycVar;
                wycVar2.getClass();
                uyc uycVar2 = uycVar;
                if (uycVar2.d) {
                    return;
                }
                y52Var.d(uycVar2);
                wycVar2.b.notifyDataSetChanged();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            wyc wycVar = this.c;
            wycVar.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_view_day, viewGroup, false);
            yyc yycVar = new yyc(viewInflate, (CalendarView) wycVar.a);
            yycVar.c = (CircleAnimationTextView) viewInflate.findViewById(R.id.tv_day_number);
            return yycVar;
        }
        if (i == 2) {
            n3z n3zVar = this.d;
            n3zVar.getClass();
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_view_other_day, viewGroup, false);
            o3z o3zVar = new o3z(viewInflate2, n3zVar.a);
            o3zVar.a = (TextView) viewInflate2.findViewById(R.id.tv_day_number);
            return o3zVar;
        }
        if (i != 3) {
            hb5.a("Unknown view type");
            return null;
        }
        azc azcVar = this.b;
        azcVar.getClass();
        View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_view_day_of_week, viewGroup, false);
        bzc bzcVar = new bzc(viewInflate3, (CalendarView) azcVar.a);
        bzcVar.a = (TextView) viewInflate3.findViewById(R.id.tv_day_name);
        bzcVar.c = new SimpleDateFormat("EE");
        return bzcVar;
    }
}
