package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbu extends ArrayAdapter implements View.OnClickListener {
    private final Context zza;
    private int zzb;

    public zzbu(Context context, List list, int i10) {
        super(context, R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList() : list);
        this.zza = context;
        this.zzb = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, @Nullable View view, ViewGroup viewGroup) {
        zzbt zzbtVar;
        if (view == null) {
            view = ((LayoutInflater) Preconditions.checkNotNull((LayoutInflater) this.zza.getSystemService("layout_inflater"))).inflate(R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            zzbtVar = new zzbt(this, (TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio), null);
            view.setTag(zzbtVar);
        } else {
            zzbtVar = (zzbt) Preconditions.checkNotNull((zzbt) view.getTag());
        }
        zzbtVar.zzb.setTag(Integer.valueOf(i10));
        zzbtVar.zzb.setChecked(this.zzb == i10);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) Preconditions.checkNotNull((MediaTrack) getItem(i10));
        String name = mediaTrack.getName();
        Locale languageLocale = mediaTrack.getLanguageLocale();
        if (TextUtils.isEmpty(name)) {
            if (mediaTrack.getSubtype() == 2) {
                name = this.zza.getString(R.string.cast_tracks_chooser_dialog_closed_captions);
            } else if (languageLocale != null) {
                name = languageLocale.getDisplayLanguage();
                if (TextUtils.isEmpty(name)) {
                    name = this.zza.getString(R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i10 + 1));
                }
            } else {
                name = this.zza.getString(R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i10 + 1));
            }
        }
        zzbtVar.zza.setText(name);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzb = ((Integer) Preconditions.checkNotNull(((zzbt) Preconditions.checkNotNull((zzbt) view.getTag())).zzb.getTag())).intValue();
        notifyDataSetChanged();
    }

    @Nullable
    public final MediaTrack zza() {
        int i10 = this.zzb;
        if (i10 < 0 || i10 >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.zzb);
    }
}
