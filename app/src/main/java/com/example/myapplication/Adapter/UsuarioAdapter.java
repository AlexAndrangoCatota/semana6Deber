package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Model.Usuario;
import com.example.myapplication.R;

import java.util.List;


public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder> {

    private Context Ctx;
    private List<Usuario> lstUsuarios;

    public UsuarioAdapter(Context mCtx, List<Usuario> usuarios) {
        this.lstUsuarios = usuarios;
        Ctx=mCtx;
    }

    @Override
    public UsuarioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.item_usuario, null);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UsuarioViewHolder holder, int position) {

        Usuario usuario = lstUsuarios.get(position);

        holder.textViewID.setText(usuario.getIdevaluador());
        holder.textViewNombre.setText(usuario.getNombres());
        holder.textViewArea.setText(usuario.getArea());

        Glide.with(Ctx)
                .load(usuario.getImgJPG()).error(R.drawable.foto)
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return lstUsuarios.size();
    }


    class UsuarioViewHolder extends RecyclerView.ViewHolder {

        TextView   textViewID, textViewNombre, textViewArea;
        ImageView imageView;

        public UsuarioViewHolder(View itemView) {
            super(itemView);

            textViewID= itemView.findViewById(R.id.txtID);
            textViewNombre = itemView.findViewById(R.id.txtNombre);
            textViewArea = itemView.findViewById(R.id.txtArea);

            imageView = itemView.findViewById(R.id.imgAvatar);
        }
    }

}
