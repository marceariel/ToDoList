package com.yalantis.beamazingtoday.ui.callback;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ItemTouchHelper;

import com.yalantis.beamazingtoday.listeners.BatListener;

public class BatCallback extends ItemTouchHelper.SimpleCallback {

    private BatListener mListener;

    public BatCallback(BatListener listener) {
        super(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        mListener = listener;
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        if (mListener != null) {
            mListener.delete(viewHolder.getAdapterPosition());
        }
    }
}
