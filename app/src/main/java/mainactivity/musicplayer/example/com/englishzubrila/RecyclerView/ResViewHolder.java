package mainactivity.musicplayer.example.com.englishzubrila.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mainactivity.musicplayer.example.com.englishzubrila.Glav.Listener;
import mainactivity.musicplayer.example.com.englishzubrila.R;

class ResViewHolder extends RecyclerView.ViewHolder{
    private TextView textView;
    private Listener listener;


    public ResViewHolder(@NonNull View itemView, final Listener listener ) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView2);
        this.listener = listener;

    }

    public void bind(final Content content) {
        textView.setText(content.getName(getAdapterPosition()));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClikGaleri(getAdapterPosition());
            }
        });
    }
}
