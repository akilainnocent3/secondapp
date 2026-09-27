package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.k;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class TracksChooserDialogFragment extends k {

    @h1
    boolean zza;

    @h1
    List zzb;

    @h1
    List zzc;

    @Nullable
    private long[] zzd;

    @Nullable
    private Dialog zze;

    @Nullable
    private RemoteMediaClient zzf;

    @Nullable
    private MediaInfo zzg;
    private long[] zzh;

    @Deprecated
    public TracksChooserDialogFragment() {
    }

    @NonNull
    public static TracksChooserDialogFragment newInstance() {
        return new TracksChooserDialogFragment();
    }

    public static /* bridge */ /* synthetic */ void zzc(TracksChooserDialogFragment tracksChooserDialogFragment, zzbu zzbuVar, zzbu zzbuVar2) {
        if (!tracksChooserDialogFragment.zza) {
            tracksChooserDialogFragment.zzf();
            return;
        }
        RemoteMediaClient remoteMediaClient = (RemoteMediaClient) Preconditions.checkNotNull(tracksChooserDialogFragment.zzf);
        if (!remoteMediaClient.hasMediaSession()) {
            tracksChooserDialogFragment.zzf();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack mediaTrackZza = zzbuVar.zza();
        if (mediaTrackZza != null && mediaTrackZza.getId() != -1) {
            arrayList.add(Long.valueOf(mediaTrackZza.getId()));
        }
        MediaTrack mediaTrackZza2 = zzbuVar2.zza();
        if (mediaTrackZza2 != null) {
            arrayList.add(Long.valueOf(mediaTrackZza2.getId()));
        }
        long[] jArr = tracksChooserDialogFragment.zzd;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator it = tracksChooserDialogFragment.zzc.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it.next()).getId()));
            }
            Iterator it2 = tracksChooserDialogFragment.zzb.iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).getId()));
            }
            for (long j10 : jArr) {
                Long lValueOf = Long.valueOf(j10);
                if (!hashSet.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr2[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        Arrays.sort(jArr2);
        remoteMediaClient.setActiveMediaTracks(jArr2);
        tracksChooserDialogFragment.zzf();
    }

    private static int zzd(List list, @Nullable long[] jArr, int i10) {
        if (jArr != null && list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                for (long j10 : jArr) {
                    if (j10 == ((MediaTrack) list.get(i11)).getId()) {
                        return i11;
                    }
                }
            }
        }
        return i10;
    }

    private static ArrayList zze(List list, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaTrack mediaTrack = (MediaTrack) it.next();
            if (mediaTrack.getType() == i10) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    private final void zzf() {
        Dialog dialog = this.zze;
        if (dialog != null) {
            dialog.cancel();
            this.zze = null;
        }
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.zza = true;
        this.zzc = new ArrayList();
        this.zzb = new ArrayList();
        this.zzd = new long[0];
        CastSession currentCastSession = CastContext.getSharedInstance(getContext()).getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && currentCastSession.isConnected()) {
            RemoteMediaClient remoteMediaClient = currentCastSession.getRemoteMediaClient();
            this.zzf = remoteMediaClient;
            if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zzf.getMediaInfo() != null) {
                RemoteMediaClient remoteMediaClient2 = this.zzf;
                long[] jArr = this.zzh;
                if (jArr != null) {
                    this.zzd = jArr;
                } else {
                    MediaStatus mediaStatus = remoteMediaClient2.getMediaStatus();
                    if (mediaStatus != null) {
                        this.zzd = mediaStatus.getActiveTrackIds();
                    }
                }
                MediaInfo mediaInfo = this.zzg;
                if (mediaInfo == null) {
                    mediaInfo = remoteMediaClient2.getMediaInfo();
                }
                if (mediaInfo == null) {
                    this.zza = false;
                    return;
                }
                List<MediaTrack> mediaTracks = mediaInfo.getMediaTracks();
                if (mediaTracks == null) {
                    this.zza = false;
                    return;
                }
                this.zzc = zze(mediaTracks, 2);
                ArrayList arrayListZze = zze(mediaTracks, 1);
                this.zzb = arrayListZze;
                if (arrayListZze.isEmpty()) {
                    return;
                }
                List list = this.zzb;
                MediaTrack.Builder builder = new MediaTrack.Builder(-1L, 1);
                builder.setName(getActivity().getString(R.string.cast_tracks_chooser_dialog_none));
                builder.setSubtype(2);
                builder.setContentId("");
                list.add(0, builder.build());
                return;
            }
        }
        this.zza = false;
    }

    @Override // androidx.fragment.app.k
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int iZzd = zzd(this.zzb, this.zzd, 0);
        int iZzd2 = zzd(this.zzc, this.zzd, -1);
        zzbu zzbuVar = new zzbu(getActivity(), this.zzb, iZzd);
        zzbu zzbuVar2 = new zzbu(getActivity(), this.zzc, iZzd2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.text_list_view);
        ListView listView2 = (ListView) viewInflate.findViewById(R.id.audio_list_view);
        TabHost tabHost = (TabHost) viewInflate.findViewById(R.id.tab_host);
        tabHost.setup();
        if (zzbuVar.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) zzbuVar);
            TabHost.TabSpec tabSpecNewTabSpec = tabHost.newTabSpec("textTab");
            tabSpecNewTabSpec.setContent(R.id.text_list_view);
            tabSpecNewTabSpec.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_subtitles));
            tabHost.addTab(tabSpecNewTabSpec);
        }
        if (zzbuVar2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) zzbuVar2);
            TabHost.TabSpec tabSpecNewTabSpec2 = tabHost.newTabSpec("audioTab");
            tabSpecNewTabSpec2.setContent(R.id.audio_list_view);
            tabSpecNewTabSpec2.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_audio));
            tabHost.addTab(tabSpecNewTabSpec2);
        }
        builder.setView(viewInflate).setPositiveButton(getActivity().getString(R.string.cast_tracks_chooser_dialog_ok), new zzbr(this, zzbuVar, zzbuVar2)).setNegativeButton(R.string.cast_tracks_chooser_dialog_cancel, new zzbq(this));
        Dialog dialog = this.zze;
        if (dialog != null) {
            dialog.cancel();
            this.zze = null;
        }
        AlertDialog alertDialogCreate = builder.create();
        this.zze = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private TracksChooserDialogFragment(MediaInfo mediaInfo, long[] jArr) {
        this.zzg = mediaInfo;
        this.zzh = jArr;
    }

    @NonNull
    @Deprecated
    public static TracksChooserDialogFragment newInstance(@NonNull MediaInfo mediaInfo, @NonNull long[] jArr) {
        return new TracksChooserDialogFragment(mediaInfo, jArr);
    }
}
